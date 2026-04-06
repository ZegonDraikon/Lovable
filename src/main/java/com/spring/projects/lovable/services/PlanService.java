package com.spring.projects.lovable.services;

import com.spring.projects.lovable.dto.subscription.PlanReponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface PlanService {

    @Nullable List<PlanReponse> getAllPlans();
}
