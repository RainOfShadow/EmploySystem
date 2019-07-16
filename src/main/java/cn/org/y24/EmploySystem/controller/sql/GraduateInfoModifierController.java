package cn.org.y24.EmploySystem.controller.sql;

import cn.org.y24.EmploySystem.service.CustomUserDetailsService;
import cn.org.y24.EmploySystem.service.GraduateInfoService;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class GraduateInfoModifierController {
    @Resource
    CustomUserDetailsService userDetailsService;
    @Resource
    GraduateInfoService graduateInfoService;

    @PostMapping("/graduateInfoModifier")
    @ResponseBody
    String graduateInfoModifier(HttpServletRequest httpServletRequest, @RequestParam(value = "info") String[] info) {
        final String username = SecurityContextHolder.getContext().getAuthentication().getName();
        if (userDetailsService.loadUserByUsername(username) == null) {
            return "505";
        }
        if (graduateInfoService.findGraduateInfoByUsername(username) != null) {
            graduateInfoService.deleteGraduate(username);
        }
        graduateInfoService.addGraduateInfo(info[0],
                info[1],
                username,
                info[2],
                info[5],
                info[6],
                info[7],
                info[8].equals("female,"),
                info[9],
                info[10],
                info[11],
                info[4],
                info[3],
                info[12],
                info[13],
                info[14],
                new Date(info[15]),
                info[16],
                info[17],
                info[18],
                info[19]);
        return "true";
    }

}

