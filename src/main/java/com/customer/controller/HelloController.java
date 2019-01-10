package com.customer.demo.controller;

import com.customer.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

/**
 * @author oujian
 * create by 2019/1/7
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;
    public ResponseEntity get(){
        helloService.get();
        return null;
    }
}
