package com.spring.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    public String getHelloPage() {
        return "<h1>Hello world!</h1><p><i>We <strong>greeting</strong> you!</i></p>";
    }
}
