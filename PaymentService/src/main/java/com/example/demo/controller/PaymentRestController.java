package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.consumer.CartRestConsume;
import com.example.demo.consumer.Icicibankconsumer;

@RestController
public class PaymentRestController {

    @Autowired
    private CartRestConsume cartConsumer;

    @Autowired
    private Icicibankconsumer iciciConsumer;

    @GetMapping("/payment/data")
    public String getPaymentData() {
        String cartData = cartConsumer.getCartData();
        String bankResponse = iciciConsumer.callIciciBank();
        return "FROM PAYMENT SERVICE -> [" + cartData + "] AND [" + bankResponse + "]";
    }
}