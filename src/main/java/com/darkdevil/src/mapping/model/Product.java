package com.darkdevil.src.mapping.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Product {
    @Id
    private int productId;
    private String productName;
}
