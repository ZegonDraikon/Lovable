package com.spring.projects.lovable.services.impl;

import com.spring.projects.lovable.dto.subscription.PlanLimitResponse;
import com.spring.projects.lovable.dto.subscription.UsageTodayResponse;
import com.spring.projects.lovable.services.UsageService;
import org.jspecify.annotations.Nullable;

public class UsageServiceImpl implements UsageService {
    @Override
    public @Nullable UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public @Nullable PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
