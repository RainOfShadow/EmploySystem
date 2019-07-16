package cn.org.y24.EmploySystem.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataSignController {
    @RequestMapping("/dataSign")
    String dataSign(Model model) {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("UserName", username);
        return "../static/data_sign";
    }
}
