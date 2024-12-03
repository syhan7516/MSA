package com.sparta.msa_exam.product;

import java.util.List;

public interface ProductService {

    ProductCreateResDto createProduct(ProductCreateReqDto productCreateReqDto);

    List<ProductGetResDto> getAllProducts();
}
