package com.jchen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping(value = "/hello")
    public String sayHello(Model model){
        model.addAttribute("name", "Jeremy");
        return "hello";
    }
}
