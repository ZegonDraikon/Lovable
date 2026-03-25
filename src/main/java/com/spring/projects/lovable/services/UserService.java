package com.spring.projects.lovable.services;

import com.spring.projects.lovable.dto.auth.UserProfileResponse;
import org.jspecify.annotations.Nullable;

public interface UserService {
    @Nullable UserProfileResponse getProfile(Long userId);
}
