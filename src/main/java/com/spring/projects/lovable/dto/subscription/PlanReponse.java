package com.spring.projects.lovable.dto.subscription;

public record PlanReponse(
        Long id,
        String name,
        String stripeProjects,
        Integer maxTokensPerDay,
        Integer maxPreviews,
        Boolean unlimitedAi,
        Boolean active
) {
}
