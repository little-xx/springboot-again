package com.littlexx.springbootagain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
