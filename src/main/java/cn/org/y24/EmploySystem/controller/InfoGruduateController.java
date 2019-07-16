package cn.org.y24.EmploySystem.controller;

import cn.org.y24.EmploySystem.service.GraduateInfoService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class InfoGruduateController {
    @Resource
    GraduateInfoService graduateInfoService;

    @RequestMapping("/infoGraduate")
    String infoGraduate(Model model) {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("UserName", username);
        var graduate = graduateInfoService.findGraduateInfoByUsername(username);
        if (graduate == null) {
            return "error";
        }
        model.addAttribute("GraduateUserAdditionalInfo", graduate);
        return "../static/infoGraduate";
    }
}
