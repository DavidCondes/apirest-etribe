package com.etribe.technical.test.controllers;

import com.etribe.technical.test.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;


    @PostMapping("/token")
    public String token (Authentication authentication){
        String token = authenticationService.generateToken(authentication);
        return token;
    }
}
