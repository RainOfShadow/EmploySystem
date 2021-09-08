package com.group.employsystem.controller;


import com.group.employsystem.entity.User;
import com.group.employsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ly
 * @since 2021-09-07
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    String register() {
        return "register";
    }

    @RequestMapping("/login")
    String login() {
        return "login";
    }


    @PostMapping("/doRegister")
    @ResponseBody
    public boolean register(HttpServletRequest httpServletRequest) {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        User user = userService.getById(username);
        if (user != null) {
            return  false;
        }
        String role = httpServletRequest.getParameter("role");
        boolean success = userService.save(new User(username, password, Integer.parseInt(role)));
        if (success)  {
            return true;
        } else {
            return false;
        }
    }


    @PostMapping("/doLogin")
    @ResponseBody
    public boolean login(HttpServletRequest httpServletRequest) {
        String username = httpServletRequest.getParameter("username");
        String password = httpServletRequest.getParameter("password");
        User user = userService.getById(username);
        if (user != null) {
            return  false;
        }
        String role = httpServletRequest.getParameter("role");
        boolean success = userService.save(new User(username, password, Integer.parseInt(role)));
        if (success)  {
            return true;
        } else {
            return false;
        }
    }
}

