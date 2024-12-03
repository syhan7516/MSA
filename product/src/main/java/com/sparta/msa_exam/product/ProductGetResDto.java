package com.sparta.msa_exam.product;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductGetResDto {

    private Long productId;
    private String productName;
    private Integer supplyPrice;

    public static ProductGetResDto from(Product product) {
        return ProductGetResDto.builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .supplyPrice(product.getSupplyPrice())
                .build();
    }
}
