package cn.org.y24.EmploySystem.controller.sql;

import cn.org.y24.EmploySystem.service.AdminInfoService;
import cn.org.y24.EmploySystem.service.CustomUserDetailsService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminAuthenticationController {
    @Resource
    CustomUserDetailsService userDetailsService;
    @Resource
    AdminInfoService adminInfoService;

    @RequestMapping("/AdminAuthentication")
    @ResponseBody
    String authentication(HttpServletRequest request) {
        final String username = request.getParameter("username");
        if (isUsernameLegal(username)) {
            return "403";
        }
        final String authenticationCode = request.getParameter("authenticationCode");
        if (userDetailsService.loadUserByUsername(username) == null) {
            return "505";
        }
        if (adminInfoService.findAdminUserAdditionalInfoByCode(authenticationCode) != null) {
            return "false";
        }
        if (adminInfoService.findAdminUserAdditionalInfoByUsername(username) != null) {
            adminInfoService.deleteAdminInfo(username);
        }
        adminInfoService.addAdminInfo(username, authenticationCode);
        return "true";

    }

    private boolean isUsernameLegal(String name) {
        return name.equals(SecurityContextHolder.getContext().getAuthentication().getName());
    }
}
