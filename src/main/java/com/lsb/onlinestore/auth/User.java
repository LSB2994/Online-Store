package com.lsb.onlinestore.auth;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    private Long id;
    private String username;
    private String email;
    private String password;
}
