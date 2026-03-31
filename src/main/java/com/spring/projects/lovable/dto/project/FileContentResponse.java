package com.spring.projects.lovable.dto.project;

import java.time.Instant;

public record FileContentResponse(
        String path,
        Instant modifiedAt,
        Long size,
        String type
) {
}
