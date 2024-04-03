package com.luizmarcelo.emailapi.model.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmailDTO {
    private String destinatario;
    private String corpoEmail;
    private String assunto;

}
