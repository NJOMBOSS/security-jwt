package com.securityjwt.controller;

import com.securityjwt.service.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);
    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public String token(String username, String password){
        LOG.debug("Token requested for user: '{}'", username);
        String token = tokenService.generatedToken(username, password);
        LOG.debug("Token granted {}", token);
        return token;
    }
}
