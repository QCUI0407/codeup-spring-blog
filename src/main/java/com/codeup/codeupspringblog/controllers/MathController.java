package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add/{num}/and/{num2}")
    @ResponseBody
    public String addNum(@PathVariable int num, @PathVariable int num2){
//        return String.valueOf(num + num2);
        return num + "+" + num2 + "=" + (num+num2);
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public int subtractNum(@PathVariable int num1, @PathVariable int num2){
        return num2 - num1;
    }

    @GetMapping("/multiply/{num1}/from/{num2}")
    @ResponseBody
    public int multiplyNum(@PathVariable int num1, @PathVariable int num2){
        return num2 * num1;
    }

    @GetMapping("/divide/{num1}/from/{num2}")
    @ResponseBody
    public double divideNum(@PathVariable double num1, @PathVariable double num2){
        return num1 / num2;
    }
}
