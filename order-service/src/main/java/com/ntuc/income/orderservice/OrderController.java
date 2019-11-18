package com.ntuc.income.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Source source;

    @GetMapping("/orders/items")
    public List<String> getItems(){
        System.out.println("Order service invoked");
        source.output().send(MessageBuilder.withPayload("order-34895").build());
        return restTemplate.getForObject("http://ITEM-SERVICE/items", List.class);
    }
}
