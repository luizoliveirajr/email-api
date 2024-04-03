package com.luizmarcelo.emailapi.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.luizmarcelo.emailapi.model.enums.EnumError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@JsonIgnoreProperties(value = {"stackTrace", "cause", "message", "suppressed", "localizedMessage"})
public class ServiceException extends RuntimeException {
    private final String mensagem;
    private final Integer httpStatus;
    private final String tipo;

    public ServiceException(EnumError error) {
        this.mensagem = error.getDescricao();
        this.httpStatus = error.getStatus().value();
        this.tipo = error.getTipo();
    }
}
