package com.example.joy.login.daoImpl;

import com.example.joy.login.dao.LoginDao;
import com.example.joy.login.vo.userVo;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl extends SqlSessionDaoSupport implements LoginDao {
    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    @Override
    public userVo usrLogin(userVo usrVo) {

        System.out.println("<<LoginDaoImpl>>");
        System.out.println(usrVo.toString());
        System.out.println((String) getSqlSession().selectOne("LoginDaoImpl.selectTestSample", usrVo));


        return null;

    }
}
