package cn.org.y24.EmploySystem.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping(value = {"/", "/home", "/index"})
    public String index(Model model) {
        System.out.println(String.format("UserName: %s", SecurityContextHolder.getContext().getAuthentication().getName()));
        model.addAttribute("UserName", SecurityContextHolder.getContext().getAuthentication().getName());
        return "../static/index";
    }
}

