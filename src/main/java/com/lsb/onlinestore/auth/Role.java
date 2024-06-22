package com.lsb.onlinestore.auth;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "roles")
@Setter
@Getter
@NoArgsConstructor
public class Role {
    @Id
    private Integer id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;
    @ManyToMany
    private List<Authority> authorities;
}
