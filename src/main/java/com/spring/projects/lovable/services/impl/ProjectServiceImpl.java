package com.spring.projects.lovable.services.impl;

import com.spring.projects.lovable.dto.project.ProjectRequest;
import com.spring.projects.lovable.dto.project.ProjectResponse;
import com.spring.projects.lovable.dto.project.ProjectSummaryResponse;
import com.spring.projects.lovable.services.ProjectService;
import org.jspecify.annotations.Nullable;

import java.util.List;

public class ProjectServiceImpl implements ProjectService {
    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return List.of();
    }

    @Override
    public @Nullable ProjectResponse getProjectById(Long userId) {
        return null;
    }

    @Override
    public @Nullable ProjectResponse createProject(Long userId) {
        return null;
    }

    @Override
    public @Nullable ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public @Nullable ProjectResponse deleteProject(Long userId) {
        return null;
    }
}
