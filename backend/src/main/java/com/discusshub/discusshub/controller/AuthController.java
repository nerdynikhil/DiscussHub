package com.discusshub.discusshub.controller;

import com.discusshub.discusshub.service.AuthenticationRequest;
import com.discusshub.discusshub.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody AuthenticationRequest authenticationRequest) {
        // Implement authentication logic
        return authService.login(authenticationRequest);
    }

    // Add other authentication-related endpoints
}
