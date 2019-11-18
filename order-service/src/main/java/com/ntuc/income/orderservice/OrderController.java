package com.ntuc.income.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/orders/items")
    public List<String> getItems(){
        System.out.println("Order service invoked");
        return restTemplate.getForObject("http://localhost:8080/items", List.class);
    }
}
