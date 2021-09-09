package com.group.employsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname PageController
 * @Description TODO
 * @Date 2021/9/8 14:25
 * @Author 冷心影翼
 */

@Controller
public class PageController {


    @RequestMapping(value = {"/", "/home", "/index"})
    public String index(Model model) {
        return "../static/index";
    }

    @RequestMapping("/register")
    String register(Model model) {
        return "register";
    }

    @RequestMapping("/login")
    String login(Model model) {
        return "login";
    }

    @RequestMapping("/graduateInfo")
    String graduateInfo(Model model) {
        return "graduateUserInfoCenter";
    }
}
