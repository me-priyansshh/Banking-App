package com.lalith.minibanking.ExceptionHandling;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.security.authentication.event.AbstractAuthenticationFailureEvent;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AuthenticationEvents {
    @EventListener
    public void onSucess(AuthenticationSuccessEvent sucessEvent){
        log.info("Authentication success for user {}", sucessEvent.getAuthentication().getName());
    }

    @EventListener
    public void onFailure(AbstractAuthenticationFailureEvent failureEvent){
        log.info("Authentication failed for user {}", failureEvent.getAuthentication().getName(),
                failureEvent.getException().getMessage());

    }
}
