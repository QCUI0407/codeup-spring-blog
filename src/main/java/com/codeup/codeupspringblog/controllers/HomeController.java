package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    //if want link Thymeleaf do not need @ResponseBody
    //    @ResponseBody
    public String homePage(){
        return "home";
    }

}
