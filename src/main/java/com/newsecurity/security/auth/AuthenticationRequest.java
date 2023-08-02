package com.newsecurity.security.auth;

import lombok.Data;

@Data
public class AuthenticationRequest {

    private String email;
    String password;

}
