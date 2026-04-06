package com.spring.projects.lovable.services;

import com.spring.projects.lovable.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {

    @Nullable UsageTodayResponse getTodayUsageOfUser(Long userId);

    Object getCurrentSubscriptionLimitsOfUser(Long userId);
}
