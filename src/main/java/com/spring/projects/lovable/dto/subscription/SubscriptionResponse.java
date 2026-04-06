package com.spring.projects.lovable.dto.subscription;

import java.time.Instant;

public record SubscriptionResponse(
        PlanReponse plan,
        String status,
        Instant periodEnd,
        Long tokensUsedThisCycle
) {
}
