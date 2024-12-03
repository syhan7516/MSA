package com.sparta.msa_exam.product;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductCreateResDto {

    private Long productId;
    private String productName;
    private Integer supplyPrice;

    public static ProductCreateResDto from(Product product) {
        return ProductCreateResDto.builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .supplyPrice(product.getSupplyPrice())
                .build();
    }
}