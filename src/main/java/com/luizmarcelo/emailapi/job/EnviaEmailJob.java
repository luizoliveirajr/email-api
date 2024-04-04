package com.luizmarcelo.emailapi.job;

import com.luizmarcelo.emailapi.exception.ServiceException;
import com.luizmarcelo.emailapi.model.Email;
import com.luizmarcelo.emailapi.model.UserCredentials;
import com.luizmarcelo.emailapi.model.enums.EnumError;
import com.luizmarcelo.emailapi.service.EmailService;
import com.luizmarcelo.emailapi.service.UserCredentialsService;
import com.luizmarcelo.emailapi.util.TemplateBoasVindas;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
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
                MimeMessage mensagem = prepararEmailParaEnvioTemplateHtml(email);
                enviarEmail(mensagem);
                emailService.alterarStatusEmailParaEnviado(email);
                System.out.println(LocalDateTime.now().format(formatter) + " - Email Enviado para " + email.getDestinatario());
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
        mensagem.setText(TemplateBoasVindas.HTML);
        mensagem.setSubject("Boas Vindas");
        return mensagem;
    }

    public MimeMessage prepararEmailParaEnvioTemplateHtml(Email email) throws MessagingException {
        MimeMessage mensagem = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mensagem, true);
        helper.setFrom(email.getRemetente());
        helper.setTo(email.getDestinatario());
        helper.setSubject("Boas Vindas");
        helper.setText(TemplateBoasVindas.HTML, true); // Defina o conteúdo como HTML
        return mensagem;
    }

    public void enviarEmail(MimeMessage mensagem) {
        JavaMailSenderImpl senderImpl = (JavaMailSenderImpl) javaMailSender;
        UserCredentials userCredentials = userCredentialsService.retornarUsuarioPrincipalSMTP();
        senderImpl.setUsername(userCredentials.getUserEmail());
        senderImpl.setPassword(userCredentials.getPassword());
        senderImpl.send(mensagem);
    }

}
