package com.spring.projects.lovable.services.impl;

import com.spring.projects.lovable.dto.subscription.CheckoutReponse;
import com.spring.projects.lovable.dto.subscription.CheckoutRequest;
import com.spring.projects.lovable.dto.subscription.PortalResponse;
import com.spring.projects.lovable.dto.subscription.SubscriptionResponse;
import com.spring.projects.lovable.services.SubscriptionService;
import org.jspecify.annotations.Nullable;

public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public @Nullable CheckoutReponse checkoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public @Nullable PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
