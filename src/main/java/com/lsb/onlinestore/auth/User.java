package com.lsb.onlinestore.auth;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users")
@Setter
@Getter
@NoArgsConstructor
public class User {
    @Id
    private Long id;
    @Column(unique = true,nullable = false)
    private String uuid;
    @Column(unique = true,length = 80,nullable = false)
    private String username;
    @Column(unique = true,length = 80,nullable = false)
    private String email;
    @Column(name = "encrypted_passwd",nullable = false)
    private String password;
    @Column(length = 30)
    private String nickName;
    @Column(length = 10)
    private String verifiedCode;
    private Boolean isVerified;
    private Boolean isDeleted;
    @ManyToMany
    @JoinTable(
            joinColumns = @JoinColumn(name ="user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name ="role_id", referencedColumnName = "id"))
    private List<Role> roles;
}
