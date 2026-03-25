package com.spring.projects.lovable.dto.auth;

public record LoginRequest(
        String email,
        String name,
        String password
)   {
}
