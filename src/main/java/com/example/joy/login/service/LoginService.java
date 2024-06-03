package com.example.joy.login.service;

import com.example.joy.login.serviceImpl.LoginServiceImpl;
import com.example.joy.login.vo.userVo;


public interface LoginService{

    userVo usrLogin(userVo usrVo);
}
