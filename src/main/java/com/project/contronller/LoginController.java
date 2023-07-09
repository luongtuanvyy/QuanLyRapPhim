package com.project.contronller;

import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public String login() {
        userService.findAll().stream().forEach(user -> System.out.println(user.getEmail()));
        return "index";
    }
}
