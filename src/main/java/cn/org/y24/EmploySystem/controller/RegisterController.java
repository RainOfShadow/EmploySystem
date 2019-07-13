package cn.org.y24.EmploySystem.controller;

import cn.org.y24.EmploySystem.service.AccountService;
import cn.org.y24.EmploySystem.service.CustomUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {
    @Resource
    CustomUserDetailsService userDetailsService;
    @Resource
    AccountService accountService;

    @RequestMapping("/register")
    String register() {
        return "register";
    }

    @RequestMapping("/doRegister")
    @ResponseBody
    String doRegister(HttpServletRequest request) {
        UserDetails sqlUserDetails = userDetailsService.loadUserByUsername(request.getParameter("username"));
        if (sqlUserDetails != null) {
            return "false";
        } else {
            accountService.addUser(request.getParameter("username"),
                    request.getParameter("password"),
                    request.getParameter("type"),
                    true, true, true, true);
            return "true";
        }

    }
}
