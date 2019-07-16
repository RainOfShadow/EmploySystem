package cn.org.y24.EmploySystem.controller.sql;

import cn.org.y24.EmploySystem.service.AccountService;
import cn.org.y24.EmploySystem.service.CustomUserDetailsService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class PasswordModifierController {
    @Resource
    CustomUserDetailsService userDetailsService;
    @Resource
    AccountService accountService;

    @RequestMapping("/passwordModifier")
    @ResponseBody
    String passwordModifier(HttpServletRequest request) {
        final String username = request.getParameter("username");
        if (isUsernameLegal(username)) {
            return "403";
        }
        final String passwordToBeChecked = request.getParameter("oldPassword");
        final String newPassword = request.getParameter("password");
        UserDetails sqlUserDetails = userDetailsService.loadUserByUsername(username);
        if (sqlUserDetails == null) {
            return "505";
        }
        if (!passwordToBeChecked.equals(sqlUserDetails.getPassword())) {
            return "false";
        } else {
            accountService.delete(username);
            accountService.addUser(username,
                    newPassword,
                    request.getParameter("type"),
                    true, true, true, true);
            return "true";
        }

    }

    private boolean isUsernameLegal(String name) {
        return name.equals(SecurityContextHolder.getContext().getAuthentication().getName());
    }
}
