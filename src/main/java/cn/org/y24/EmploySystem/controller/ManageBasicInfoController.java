package cn.org.y24.EmploySystem.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ManageBasicInfoController {
    @RequestMapping("/manageBasicInfo")
    String manageBasicInfo(Model model) {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("UserName", username);
        return "../static/manage_basicInfo";
    }
}
