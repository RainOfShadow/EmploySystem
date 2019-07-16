package cn.org.y24.EmploySystem.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployConsultController {
    @RequestMapping("/employConsult")
    String employConsult(Model model) {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("UserName", username);
        return "../static/employ_consult";
    }
}
