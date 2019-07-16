package cn.org.y24.EmploySystem.controller;

import cn.org.y24.EmploySystem.entity.SimpleUser;
import cn.org.y24.EmploySystem.service.*;
import org.springframework.security.core.context.SecurityContextHolder;
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
    @Resource
    AdminInfoService adminInfoService;
    @Resource
    CompanyService companyService;
    @Resource
    GraduateInfoService graduateInfoService;

    @RequestMapping("/user")
    String user(Model model, @RequestParam("name") String name) throws Exception {
        if (!isUsernameLegal(name)) {
            return "403";
        }
        UserDetails user = userDetailsService.loadUserByUsername(name);
        if (user == null) {
            System.out.println("no result for " + name);
            return "error";
        }
        String username = user.getUsername();
        String password = user.getPassword();
        String role = user.getAuthorities().toArray()[0].toString();
        model.addAttribute("SimpleUser", new SimpleUser(username, password, role));
        switch (role) {
            /// TODO: admin
            case "ADMIN":
                model.addAttribute("AdminUserAdditionalInfo", adminInfoService.findAdminUserAdditionalInfoByUsername(username));
                return "adminUserInfoCenter";
            case "COMPANY":

                model.addAttribute("CompanyUserAdditionalInfo", companyService.findCompanyInfoByUsername(username));
                return "companyUserInfoCenter";
            case "GRADUATE":
                model.addAttribute("GraduateUserAdditionalInfo", graduateInfoService.findGraduateInfoByUsername(username));
                return "graduateUserInfoCenter";
            default:
                throw new Exception(String.format("No role for %s", role));

        }
    }

    private boolean isUsernameLegal(String name) {
        return name.equals(SecurityContextHolder.getContext().getAuthentication().getName());
    }
}
