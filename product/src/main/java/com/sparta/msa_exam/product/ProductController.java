package com.sparta.msa_exam.product;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {

    @Value("${server.port}")
    private String serverPort;

    private final ProductService productService;

    @PostMapping("")
    public ResponseEntity<ProductCreateResDto> createProduct(
            HttpServletResponse httpServletResponse,
            @RequestBody ProductCreateReqDto productCreateReqDto) {

        httpServletResponse.addHeader("Server-Port",serverPort);
        return ResponseEntity.ok(productService.createProduct(productCreateReqDto));
    }

    @GetMapping("")
    public ResponseEntity<List<ProductGetResDto>> getAllProducts(
            HttpServletResponse httpServletResponse) {

        httpServletResponse.addHeader("Server-Port",serverPort);
        return ResponseEntity.ok(productService.getAllProducts());
    }
}
