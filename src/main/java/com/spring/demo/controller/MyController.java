package com.spring.demo.controller;

import com.spring.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class MyController {

    @Autowired
    private HelloService helloService;

    @GetMapping
    public String getHello() {
        return helloService.getHelloPage();
    }

}
