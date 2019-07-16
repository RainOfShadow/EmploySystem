package cn.org.y24.EmploySystem.controller;

import cn.org.y24.EmploySystem.service.CompanyService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class InfoCompanyController {
    @Resource
    CompanyService companyService;

    @RequestMapping("/infoEnterprise")
    String infoCompany(Model model) {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("UserName", username);
        var companyInfo = companyService.findCompanyInfoByUsername(username);
        if (companyInfo == null) {
            return "error";
        }
        model.addAttribute("CompanyInfo", companyInfo);
        return "../static/infoEnterprise";
    }
}
