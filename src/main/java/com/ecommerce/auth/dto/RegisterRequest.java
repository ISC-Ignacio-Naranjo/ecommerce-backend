package com.ecommerce.auth.dto;

import com.ecommerce.security.user.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {
    private String username;
    private String email;
    private String password;
    private Role role; // Optional: default to CUSTOMER in service
}
