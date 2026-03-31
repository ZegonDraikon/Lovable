package com.spring.projects.lovable.services;

import com.spring.projects.lovable.dto.member.InviteMemberRequest;
import com.spring.projects.lovable.dto.member.MemberResponse;
import com.spring.projects.lovable.entity.ProjectMember;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMember(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);
}
