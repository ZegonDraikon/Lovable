package com.spring.projects.lovable.dto.auth;

public record ProfileResponse(
        Long id,
        String email,
        String name,
        String avatarUrl
) {
}
