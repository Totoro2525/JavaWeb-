package com.totoro.service;

import com.totoro.dao.UserDao;
import com.totoro.model.User;

public class UserService {
    public boolean register(String username,String password,int age,String sex){
        UserDao userDao=new UserDao();
        return userDao.addUser(username,password,age,sex);
    }
    public User login(String username, String password){
        UserDao userDao=new UserDao();
        return userDao.getUserByUP(username,password);
    }
    public boolean isExit(String username){
        return  (new UserDao()).isExist(username);
    }
}
