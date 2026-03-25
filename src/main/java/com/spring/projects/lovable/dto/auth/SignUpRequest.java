package com.spring.projects.lovable.dto.auth;

public record SignUpRequest(
        String email,
        String name,
        String password
) {
}
