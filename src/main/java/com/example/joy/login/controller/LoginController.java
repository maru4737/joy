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
import javax.servlet.http.HttpSession;

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

        String returnPage = "/main";
        String resultMsg = "";
        HttpSession session = request.getSession();
        userVo loginRst = loginService.usrLogin(usrVo);

        if(loginRst.getId()==usrVo.getId()){
            model.addAttribute("userVo",loginRst);
            session.setAttribute("user",loginRst);
        }else{
            resultMsg = "아이디 또는 비밀번호가 다릅니다.";
            model.addAttribute("resultMsg",resultMsg);
        }



        return returnPage;
    }

}
