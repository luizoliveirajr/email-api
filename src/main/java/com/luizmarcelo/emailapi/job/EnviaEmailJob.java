package com.luizmarcelo.emailapi.job;

import com.luizmarcelo.emailapi.exception.ServiceException;
import com.luizmarcelo.emailapi.model.Email;
import com.luizmarcelo.emailapi.model.UserCredentials;
import com.luizmarcelo.emailapi.model.enums.EnumError;
import com.luizmarcelo.emailapi.service.EmailService;
import com.luizmarcelo.emailapi.service.UserCredentialsService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@Service
public class EnviaEmailJob {

    private final JavaMailSender javaMailSender;
    private final UserCredentialsService userCredentialsService;

    private final EmailService emailService;

    public EnviaEmailJob(JavaMailSender javaMailSender, UserCredentialsService userCredentialsService, EmailService emailService) {
        this.javaMailSender = javaMailSender;
        this.userCredentialsService = userCredentialsService;
        this.emailService = emailService;
    }

    @Scheduled(fixedRate = 2000) // Executa a cada 5 segundos
    public void rotinaEnviarEmail() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(LocalDateTime.now().format(formatter) + " - Verificando emails para envio");
        List<Email> emails = emailService.retornarEmailsPendentes();
        for (Email email : emails) {
            try {
                SimpleMailMessage mensagem = prepararEmailParaEnvio(email);
                enviarEmail(mensagem);
                emailService.alterarStatusEmailParaEnviado(email);
                System.out.println(LocalDateTime.now().format(formatter) + " - Email Enviado para " + Arrays.toString(mensagem.getTo()));
            } catch (Exception e) {
                emailService.alterarStatusEmailParaErro(email);
                throw new ServiceException(EnumError.FALHA_AO_ENVIAR_EMAIL);
            }
        }
    }


    public SimpleMailMessage prepararEmailParaEnvio(Email email) {
        SimpleMailMessage mensagem = new SimpleMailMessage();
        mensagem.setFrom(email.getRemetente());
        mensagem.setTo(email.getDestinatario());
        mensagem.setText(email.getCorpoEmail());
        mensagem.setSubject(email.getAssunto());
        return mensagem;
    }

    public void enviarEmail(SimpleMailMessage mensagem) {
        JavaMailSenderImpl senderImpl = (JavaMailSenderImpl) javaMailSender;
        UserCredentials userCredentials = userCredentialsService.retornarUsuarioPrincipalSMTP();
        senderImpl.setUsername(userCredentials.getUserEmail());
        senderImpl.setPassword(userCredentials.getPassword());
        senderImpl.send(mensagem);
    }

}
