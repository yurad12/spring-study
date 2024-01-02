package com.yujeong.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstSpringController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "This is my first spring!!");
        return "hello";
    }
}
