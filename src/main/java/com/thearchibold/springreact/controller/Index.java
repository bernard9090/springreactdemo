package com.thearchibold.springreact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class Index {

    @GetMapping("/index")
    public String showUpdateForm(
            Model model) {

        model.addAttribute("user", "hello world");
        return "thymeleaf";
    }

//    @GetMapping("/")
//    public String index(){
//        System.out.println("Main product path return this");
//        return "index.html";
//    }
//
//    @GetMapping("/main/product")
//    public String mainProduct(){
//        System.out.println("Main product path return this");
//        return "index.html";
//    }
//
//    @GetMapping("/main/dashboard")
//    public String mainDashboard(){
//        return "index.html";
//    }
//
//    @GetMapping("/main/widgetConfiguration")
//    public String widget(){
//        return "index.html";
//    }



}
