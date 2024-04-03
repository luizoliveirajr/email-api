package com.luizmarcelo.emailapi.service;

import com.luizmarcelo.emailapi.exception.ServiceException;
import com.luizmarcelo.emailapi.model.UserCredentials;
import com.luizmarcelo.emailapi.model.enums.EnumError;
import com.luizmarcelo.emailapi.repository.usercredentials.UserCredentialsRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCredentialsService {
    private final UserCredentialsRepository userCredentialsRepository;

    public UserCredentialsService(UserCredentialsRepository userCredentialsRepository) {
        this.userCredentialsRepository = userCredentialsRepository;
    }

    public UserCredentials retornarUsuarioPrincipalSMTP(){
        return this.userCredentialsRepository.findById(1).orElseThrow(() -> new ServiceException(EnumError.FALHA_AO_BUSCAR));
    }

    public String retornarEmailRemetentePersonalizado(){
        UserCredentials userCredentials = retornarUsuarioPrincipalSMTP();
        return userCredentials.getRemetentePersonalizado();
    }
}
