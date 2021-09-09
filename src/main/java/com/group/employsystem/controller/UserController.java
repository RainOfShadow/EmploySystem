package com.group.employsystem.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.group.employsystem.entity.Company;
import com.group.employsystem.entity.GraduateStudent;
import com.group.employsystem.entity.User;
import com.group.employsystem.service.CompanyService;
import com.group.employsystem.service.GraduateStudentService;
import com.group.employsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ly
 * @since 2021-09-07
 */
@Controller
@SessionAttributes(value = {"userInfo", "userDetail"})
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private GraduateStudentService graduateStudentService;

    @Autowired
    private CompanyService companyService;


    @PostMapping("/doRegister")
    @ResponseBody
    public boolean register(HttpServletRequest httpServletRequest) {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        User user = userService.getById(username);
        if (user != null) {
            return false;
        }
        String role = httpServletRequest.getParameter("role");
        boolean success = userService.save(new User(username, password, Integer.parseInt(role)));
        if (!success)  {
            return false;
        }
        if (role.equals("0")) {
            GraduateStudent graduateStudent = new GraduateStudent();
            graduateStudent.setUsername(username);
            graduateStudent.setStatus(0);
            graduateStudentService.save(graduateStudent);
        } else if (role.equals("1")) {
            Company company = new Company();
            company.setUsername(username);
            companyService.save(company);
        }
        return true;
    }


    @PostMapping("/doLogin")
    @ResponseBody
    public String login(HttpServletRequest httpServletRequest) {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        String role = httpServletRequest.getParameter("role");
        User user = userService.getOne(new QueryWrapper<User>().eq("username",username)
        .eq("password",password).eq("role", role));
        if (user == null) {
            return "err";
        }
        user.setPassword("");
        httpServletRequest.getSession().setAttribute("userInfo", user);
        if (role.equals("0")) {
            GraduateStudent graduateStudent = graduateStudentService.getById(username);
            httpServletRequest.getSession().setAttribute("userDetail", graduateStudent);
        } else if (role.equals("1")) {
            Company company = companyService.getById(username);
            httpServletRequest.getSession().setAttribute("userInfo", company);
        }
        return "ok";
    }

}

