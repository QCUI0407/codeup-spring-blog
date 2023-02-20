package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/home")
    //if want link Thymeleaf do not need @ResponseBody
    //    @ResponseBody
    public String homePage(){
        return "home";
    }

}
