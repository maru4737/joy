package com.example.joy.login.serviceImpl;

import com.example.joy.login.dao.LoginDao;
import com.example.joy.login.service.LoginService;
import com.example.joy.login.vo.userVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDao loginDao;

    @Override
    public userVo usrLogin(userVo usrVo) {

        return loginDao.usrLogin(usrVo);
    }
}
