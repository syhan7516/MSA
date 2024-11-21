package com.spring_cloud.eureka.client.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order/{orderId}")
    public String getOrder(@PathVariable String orderId) {
        return "order id : " + orderId;
    }
}
