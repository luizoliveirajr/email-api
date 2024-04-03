package com.luizmarcelo.emailapi.controller;

import com.luizmarcelo.emailapi.model.dto.EmailDTO;
import com.luizmarcelo.emailapi.service.EmailService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emails")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/enviar")
    public ResponseEntity<?> enviarEmail(@RequestBody EmailDTO email){
        this.emailService.cadastrarEmailParaEnvio(email);
        return ResponseEntity.ok().build();
    }
}
