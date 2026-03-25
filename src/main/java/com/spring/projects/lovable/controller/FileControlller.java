package com.spring.projects.lovable.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/projects/{projectId}/files")
public class FileControlller {

    private final FileServce fileServce;

    @Get
}
