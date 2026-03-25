package com.spring.projects.lovable.services;

import com.spring.projects.lovable.dto.auth.AuthResponse;
import com.spring.projects.lovable.dto.auth.LoginRequest;
import com.spring.projects.lovable.dto.auth.SignUpRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {
    @Nullable AuthResponse signup(SignUpRequest request);

    @Nullable AuthResponse login(LoginRequest request);
}
