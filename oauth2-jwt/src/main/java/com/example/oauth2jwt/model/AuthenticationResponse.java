package com.example.oauth2jwt.model;

/**
 * Created by : maru
 * Date  : 5/23/2020
 * Time  : 10:30 AM
 */
public class AuthenticationResponse {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
