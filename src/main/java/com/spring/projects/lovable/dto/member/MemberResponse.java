package com.spring.projects.lovable.dto.member;

import com.spring.projects.lovable.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long id,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {

}
