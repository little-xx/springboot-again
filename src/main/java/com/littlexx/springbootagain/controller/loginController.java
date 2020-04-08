package com.littlexx.springbootagain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class loginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map,
                        HttpSession session) {
        if("admin".equals(username) && "123456".equals(password)) {
            session.setAttribute("loginUser", username);
            return "redirect:/main";
        } else {
            map.put("msg", "用户名或密码错误");
            return "login";
        }
    }

    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

}
