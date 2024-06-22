package com.lsb.onlinestore.auth;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "authorities")
@Setter
@Getter
@NoArgsConstructor
public class Authority {
    @Id
    private Integer id;
    private String name;
    @ManyToMany(mappedBy = "authorities")
    private List<Role> roles;
}
