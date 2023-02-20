package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RollDice {
    @GetMapping("/roll-dice")
    public String showRollForm() {
        return "rollDice";
    }


// To show results of guess
@PostMapping("/roll-dice/{n}")
public String showResults(@RequestParam int n, Model model) {
    // Establish the random number variable
    int randomNum = (int) Math.floor(Math.random() * ((7 - 1) + 1));

    // check if the path variable is equal to the random number

    boolean result = (n == randomNum);

    model.addAttribute("number",n);
    model.addAttribute("rs", result);
    model.addAttribute("randomNum", randomNum);

    return "rollDice";
}
}
