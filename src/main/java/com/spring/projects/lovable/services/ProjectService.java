package com.spring.projects.lovable.services;

import com.spring.projects.lovable.dto.project.ProjectRequest;
import com.spring.projects.lovable.dto.project.ProjectResponse;
import com.spring.projects.lovable.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
   List<ProjectSummaryResponse> getUserProjects(Long userId);

    @Nullable ProjectResponse getProjectById(Long userId);

    @Nullable ProjectResponse createProject(Long userId);

    @Nullable ProjectResponse updateProject(Long id, ProjectRequest request, Long userId);

    @Nullable ProjectResponse deleteProject(Long userId);
}
