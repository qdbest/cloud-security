package com.imooc.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    private RestTemplate restTemplate=new RestTemplate();

    @PostMapping
    public String createOrder(@AuthenticationPrincipal String username){
        log.info(username);
//        String price=restTemplate.getForObject("http://localhost:9080/price",String.class);
//        return "order "+price;
        return "order ";
    }
}
