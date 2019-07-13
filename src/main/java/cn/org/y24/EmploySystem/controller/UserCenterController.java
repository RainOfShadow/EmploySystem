package cn.org.y24.EmploySystem.controller;

import cn.org.y24.EmploySystem.service.AccountService;
import cn.org.y24.EmploySystem.service.CustomUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class UserCenterController {
    @Resource
    CustomUserDetailsService userDetailsService;
    @Resource
    AccountService accountService;

    @RequestMapping("/user")
    String user(Model model, @RequestParam("name") String name) {
        UserDetails user = userDetailsService.loadUserByUsername(name);
        if (user == null) {
            System.out.println("no result for " + name);
            return "error";
        }
        model.addAttribute("UserDetails", user);
        return "userCenterInfo";
    }
}
