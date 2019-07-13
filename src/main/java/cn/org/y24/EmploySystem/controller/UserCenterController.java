package cn.org.y24.EmploySystem.controller;

import cn.org.y24.EmploySystem.entity.UserInfo;
import cn.org.y24.EmploySystem.service.AccountService;
import cn.org.y24.EmploySystem.service.CustomUserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserCenterController {
    @Resource
    CustomUserDetailsService userDetailsService;
    @Resource
    AccountService accountService;

    @RequestMapping("/user")
    String user(String name) {
        UserInfo userInfo = (UserInfo) userDetailsService.loadUserByUsername(name);
        return "userInfo";
    }
}
