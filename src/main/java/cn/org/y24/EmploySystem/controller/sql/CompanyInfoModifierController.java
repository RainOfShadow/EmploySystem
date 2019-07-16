package cn.org.y24.EmploySystem.controller.sql;

import cn.org.y24.EmploySystem.service.CompanyService;
import cn.org.y24.EmploySystem.service.CustomUserDetailsService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class CompanyInfoModifierController {
    @Resource
    CompanyService companyService;
    @Resource
    CustomUserDetailsService userDetailsService;

    @RequestMapping("/companyInfoModifier")
    @ResponseBody
    String companyInfoModifier(HttpServletRequest httpServletRequest, @RequestParam(value = "info") String[] info) {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        if (userDetailsService.loadUserByUsername(username) == null) {
            return "505";
        }
        if (companyService.findCompanyInfoByUsername(username) != null) {
            companyService.deleteCompanyInfo(username);
        }
        companyService.addCompanyInfo(info[0], info[1], username, info[2], info[3], info[4]);
        System.out.println(Arrays.toString(info));
        return "true";
    }
}
