package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String postIndex() {
        return "posts index page";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String postIndex(@PathVariable int id) {
        return "posts page id: " + id;
    }

    @RequestMapping(path = "/posts/creat", method = RequestMethod.GET)
    @ResponseBody
    public String postCreateForm() {
        return "post page with post creat form";
    }

    @RequestMapping(path = "/posts/creat", method = RequestMethod.POST)
    @ResponseBody
//    @PostMapping("/posts/creat")
//    @ResponseBody
    public String postCreateSubmit() {
        return "post page after creating post form";
    }
}
