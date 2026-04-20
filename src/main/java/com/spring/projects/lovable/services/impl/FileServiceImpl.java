package com.spring.projects.lovable.services.impl;

import com.spring.projects.lovable.dto.project.FileContentResponse;
import com.spring.projects.lovable.dto.project.FileNode;
import com.spring.projects.lovable.services.FileService;
import org.jspecify.annotations.Nullable;

import java.util.List;

public class FileServiceImpl implements FileService {
    @Override
    public @Nullable List<FileNode> getFileTree(Long userId, Long id) {
        return List.of();
    }

    @Override
    public @Nullable FileContentResponse getFileContent(Long projectId, String path, Long userId) {
        return null;
    }
}
