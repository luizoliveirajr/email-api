package com.luizmarcelo.emailapi.repository.email;

import com.luizmarcelo.emailapi.model.Email;
import com.luizmarcelo.emailapi.model.enums.EmailStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmailRepository extends JpaRepository<Email, Integer> {
    @Query(value = "select e from email e where e.status = :pendente")
    List<Email> retornarEmailsPendentes(EmailStatus pendente);
}