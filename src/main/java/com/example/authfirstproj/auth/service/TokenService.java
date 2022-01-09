package com.example.authfirstproj.auth.service;


public interface TokenService {
    String generateToken(String clientId);
}
