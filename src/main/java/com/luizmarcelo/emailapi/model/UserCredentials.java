package com.luizmarcelo.emailapi.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "user_credentials")
@Builder
public class UserCredentials {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "password")
    private String password;
    @Column(name = "remetentePersonalizado")
    private String remetentePersonalizado;
}
