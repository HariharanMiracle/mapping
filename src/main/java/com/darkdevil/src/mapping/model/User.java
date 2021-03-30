package com.darkdevil.src.mapping.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private List<Product> products;
}
