package com.example.joy.login.controller;

import com.example.joy.login.service.LoginService;
import com.example.joy.login.vo.userVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/Login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/LoginPage")
    public String LoginPageController(HttpServletRequest request, Model model, RedirectAttributes redirectAttributes)throws Exception{

        return "/Login/LoginMain";
    }

    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public String LoginController(HttpServletRequest request, Model model, RedirectAttributes redirectAttributes)throws Exception{

        userVo usrVo = new userVo();
        usrVo.setId(request.getParameter("id"));
        usrVo.setPw(request.getParameter("pw"));
        System.out.println("=====================================================");
        System.out.println(usrVo.getId());
        System.out.println(usrVo.getPw());

        userVo userVo = new userVo();

        userVo = loginService.usrLogin(usrVo);

        model.addAttribute("userVo",userVo);

        return "/main";
    }

}
