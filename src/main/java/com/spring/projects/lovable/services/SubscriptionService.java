package com.spring.projects.lovable.services;

import com.spring.projects.lovable.dto.subscription.CheckoutReponse;
import com.spring.projects.lovable.dto.subscription.CheckoutRequest;
import com.spring.projects.lovable.dto.subscription.PortalResponse;
import com.spring.projects.lovable.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    @Nullable CheckoutReponse checkoutSessionUrl(CheckoutRequest request, Long userId);

    @Nullable PortalResponse openCustomerPortal(Long userId);
}
