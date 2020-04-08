package com.littlexx.springbootagain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class helloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world quick";
    }

    @RequestMapping("/success")
    public String success() {
        return "success";
    }

    @RequestMapping(value = {"/", "index"})
    public String login() {
        return "login";
    }

    @RequestMapping("/main")
    public String main() {
        return "dashboard";
    }
}
