package com.spring.projects.lovable.controller;

import com.spring.projects.lovable.dto.project.ProjectRequest;
import com.spring.projects.lovable.dto.project.ProjectResponse;
import com.spring.projects.lovable.dto.project.ProjectSummaryResponse;
import com.spring.projects.lovable.services.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects")
public class ProjectController {

    private final ProjectService projectService;

    @GetMapping()
    public ResponseEntity<List<ProjectSummaryResponse>> getUserProjects() {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getUserProjects(userId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.getProjectById(userId));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest request) {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.createProject(userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id, @RequestBody ProjectRequest request) {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.updateProject(id, request,userId));
    }

    @DeleteMapping("/{/id}")
    public ResponseEntity<ProjectResponse> deleteProject(@PathVariable Long id) {
        Long userId = 1L;
        return ResponseEntity.ok(projectService.deleteProject(userId));
    }

}
