package com.totoro.dao;

import com.totoro.model.User;
import com.totoro.util.DBUtil;

public class UserDao {
    public boolean isExist(String username){
        return DBUtil.userMap.containsKey(username);
    }
    public boolean addUser(String username,String password,int age,String sex){
        if (isExist(username)) {
            return false;
        }else{
            DBUtil.userMap.put(username,new User(username,password,age,sex,false));
            return true;
        }
    }
    public boolean deleteUser(String username){
        if (isExist(username)){
            DBUtil.userMap.remove(username);
            return true;
        }else{
            return false;
        }
    }
    public User getUserByUP(String username,String password){
        if (isExist(username)){
            User u=DBUtil.userMap.get(username);
            if (u.getPassword().equals(password)){
                return u;
            }else{
                return null;
            }
        }else {
            return null;
        }
    }
}
