package com.sparta.msa_exam.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductCreateResDto createProduct(ProductCreateReqDto productCreateReqDto) {

        Product product = Product.builder()
                .productName(productCreateReqDto.getProductName())
                .supplyPrice(productCreateReqDto.getSupplyPrice())
                .build();

        return ProductCreateResDto.from(productRepository.save(product));
    }
}
