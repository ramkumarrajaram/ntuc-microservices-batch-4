package com.ntuc.income.itemservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ItemController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/items")
    public List<String> getItems() {
        System.out.println("Item service invoked");
        return Arrays.asList("iphone", "samsung", "nokia", port);
    }
}
