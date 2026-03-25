package com.spring.projects.lovable.dto.auth;

public record AuthResponse(
        String token,
        UserProfileResponse userProfileResponse
        ) {

}
