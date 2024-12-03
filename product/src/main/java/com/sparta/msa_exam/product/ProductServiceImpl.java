package com.sparta.msa_exam.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<ProductGetResDto> getAllProducts() {

        return productRepository.findAll().stream()
                .map(ProductGetResDto::from)
                .toList();
    }
}
