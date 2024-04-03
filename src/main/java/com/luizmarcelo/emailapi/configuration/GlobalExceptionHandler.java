package com.luizmarcelo.emailapi.configuration;

import com.luizmarcelo.emailapi.exception.ServiceException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ServiceException.class)
    public ResponseEntity<ServiceException> handleServiceException(ServiceException ex, WebRequest request) {
        return ResponseEntity.status(ex.getHttpStatus()).body(ex);
    }
}