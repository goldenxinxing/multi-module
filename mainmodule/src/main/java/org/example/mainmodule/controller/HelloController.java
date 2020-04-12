package org.example.mainmodule.controller;

import org.example.submodule.two.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/test")
    public String test(){
        return helloService.getUser().toString();
    }
}
