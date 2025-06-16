package com.soatro.tracker.dto;

public class AuthResponse {

    private String token;
    private String refreshToken;
//    private String tokenType = "Bearer";
//    private EmployeeDTO user;
    private Long expiresIn; // Token expiration time in seconds
}
