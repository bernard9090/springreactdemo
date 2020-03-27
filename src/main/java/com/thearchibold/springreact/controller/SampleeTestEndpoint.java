package com.thearchibold.springreact.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")

@RequestMapping("/testing")
public class SampleeTestEndpoint {

    @GetMapping(value = "/sayhello")
    public String sayHello(){
        return "This is page something";
    }

}
