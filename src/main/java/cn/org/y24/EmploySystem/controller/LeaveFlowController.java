package cn.org.y24.EmploySystem.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LeaveFlowController {
    @RequestMapping("/leaveFlow")
    String leaveFlow(Model model) {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("UserName", username);
        return "../static/leave_flow";
    }
}
