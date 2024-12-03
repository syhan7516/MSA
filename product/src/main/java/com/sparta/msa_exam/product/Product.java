package com.sparta.msa_exam.product;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "supply_price")
    private Integer supplyPrice;

    @Builder
    public Product(Long productId, String productName, Integer supplyPrice) {
        this.productId = productId;
        this.productName = productName;
        this.supplyPrice = supplyPrice;
    }
}
