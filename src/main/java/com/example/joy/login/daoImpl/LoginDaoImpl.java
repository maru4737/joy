package com.example.joy.login.daoImpl;

import com.example.joy.login.dao.LoginDao;
import com.example.joy.login.vo.userVo;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements LoginDao {


    @Override
    public userVo usrLogin(userVo usrVo) {

        System.out.println("<<LoginDaoImpl>>");
        System.out.println(usrVo.toString());

        return null;
    }
}
