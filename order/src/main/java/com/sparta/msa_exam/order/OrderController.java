package com.sparta.msa_exam.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final ProductClient productClient;

    @GetMapping("/orders/hello/{id}")
    public String hello(@PathVariable String id) {

        System.out.println("mapping success !!");

        String producInfomation = productClient.getProduct();
        return "orders -> " + id + " -> " + producInfomation;
    }
}
