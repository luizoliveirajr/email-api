package com.luizmarcelo.emailapi.service;

import com.luizmarcelo.emailapi.exception.ServiceException;
import com.luizmarcelo.emailapi.model.Email;
import com.luizmarcelo.emailapi.model.dto.EmailDTO;
import com.luizmarcelo.emailapi.model.enums.EmailStatus;
import com.luizmarcelo.emailapi.model.enums.EnumError;
import com.luizmarcelo.emailapi.repository.email.EmailRepository;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {
    private final EmailRepository emailRepository;
    private final UserCredentialsService userCredentialsService;

    public EmailService(EmailRepository emailRepository, UserCredentialsService userCredentialsService) {
        this.emailRepository = emailRepository;
        this.userCredentialsService = userCredentialsService;
    }


    public Email cadastrarEmailParaEnvio(EmailDTO emailDTO) {
        try {
            String remetentePersonalizado = userCredentialsService.retornarEmailRemetentePersonalizado();
            Email email = Email.builder()
                    .remetente(remetentePersonalizado)
                    .assunto(emailDTO.getAssunto())
                    .destinatario(emailDTO.getDestinatario())
                    .corpoEmail(emailDTO.getCorpoEmail())
                    .status(EmailStatus.PENDENTE)
                    .build();
            return salvar(email);
        } catch (Exception e) {
            throw new ServiceException(EnumError.FALHA_AO_SALVAR);
        }
    }

    public Email salvar(Email email) {
        try {
            return this.emailRepository.save(email);
        } catch (Exception e) {
            throw new ServiceException(EnumError.FALHA_AO_SALVAR);
        }
    }

    public List<Email> retornarEmailsPendentes(){
        return this.emailRepository.retornarEmailsPendentes(EmailStatus.PENDENTE);
    }
    public Email alterarStatusEmailParaEnviado(Email email){
        email.setStatus(EmailStatus.ENVIADO);
        return salvar(email);
    }

    public Email alterarStatusEmailParaErro(Email email){
        email.setStatus(EmailStatus.ERRO);
        return salvar(email);
    }
}
