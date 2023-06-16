package com.discusshub.discusshub.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String login(AuthenticationRequest authenticationRequest) {
        // Implement authentication logic
        return "login successful";
    }

    // Add other authentication-related methods
}
