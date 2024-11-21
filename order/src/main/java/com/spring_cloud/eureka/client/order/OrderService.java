package com.spring_cloud.eureka.client.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ProductClient productClient;

    public String getProduct(String productId) {
        return productClient.getProduct(productId);
    }

    public String getOrder(String orderId) {
        if(orderId.equals("1") ){
            String product = getProduct(orderId);
            return "Your order is " + orderId + " and " + product;

        }
        return "Not exist order id";
    }
}
