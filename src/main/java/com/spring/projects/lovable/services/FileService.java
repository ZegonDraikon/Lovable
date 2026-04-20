package com.spring.projects.lovable.services;

import com.spring.projects.lovable.dto.project.FileContentResponse;
import com.spring.projects.lovable.dto.project.FileNode;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface FileService {
    @Nullable List<FileNode> getFileTree(Long userId, Long id);

    @Nullable FileContentResponse getFileContent(Long projectId, String path, Long userId);
}
