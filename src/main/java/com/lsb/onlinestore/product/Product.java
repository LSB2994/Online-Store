package com.lsb.onlinestore.product;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Setter
@Getter
@NoArgsConstructor
public class Product {
    @Id
    private Long id;
    private String code;
    private String name;
    private String description;
    private String image;
    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Category category;
}
