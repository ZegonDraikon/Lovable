package com.spring.projects.lovable.services.impl;

import com.spring.projects.lovable.dto.member.InviteMemberRequest;
import com.spring.projects.lovable.dto.member.MemberResponse;
import com.spring.projects.lovable.entity.ProjectMember;
import com.spring.projects.lovable.services.ProjectMemberService;
import org.jspecify.annotations.Nullable;

import java.util.List;

public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<ProjectMember> getProjectMember(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public @Nullable MemberResponse updateMemberRole(long projectId, long memberId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public @Nullable MemberResponse deleteMemberRole(long projectId, long memberId, InviteMemberRequest request, Long userId) {
        return null;
    }
}
