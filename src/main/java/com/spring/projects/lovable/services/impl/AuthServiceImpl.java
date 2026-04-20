package com.spring.projects.lovable.services.impl;

import com.spring.projects.lovable.dto.auth.AuthResponse;
import com.spring.projects.lovable.dto.auth.LoginRequest;
import com.spring.projects.lovable.dto.auth.SignUpRequest;
import com.spring.projects.lovable.services.AuthService;
import org.jspecify.annotations.Nullable;

public class AuthServiceImpl implements AuthService {
    @Override
    public @Nullable AuthResponse signup(SignUpRequest request) {
        return null;
    }

    @Override
    public @Nullable AuthResponse login(LoginRequest request) {
        return null;
    }
}
