package com.luizmarcelo.emailapi.repository.usercredentials;

import com.luizmarcelo.emailapi.model.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCredentialsRepository extends JpaRepository<UserCredentials, Integer> {
}