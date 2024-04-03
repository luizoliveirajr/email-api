package com.luizmarcelo.emailapi.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum EmailStatus {
    PENDENTE(0),
    ENVIADO(1),
    ERRO(2);
    private final int value;
}
