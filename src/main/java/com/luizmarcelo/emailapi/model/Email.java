package com.luizmarcelo.emailapi.model;

import com.luizmarcelo.emailapi.model.enums.EmailStatus;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "email")
@Builder
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "remetente")
    private String remetente;

    @Column(name = "corpo_email", columnDefinition = "TEXT")
    private String corpoEmail;

    @Column(name = "assunto")
    private String assunto;

    @Column(name = "destinatario")
    private String destinatario;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "status")
    private EmailStatus status;

}
