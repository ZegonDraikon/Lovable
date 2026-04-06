package com.spring.projects.lovable.dto.member;

import com.spring.projects.lovable.enums.ProjectRole;

public record UpdateMemberRoleRequest(
        String ProjectRole
        ) {
}
