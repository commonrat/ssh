package com.SSH.service;

import com.SSH.dao.UserDao;
import com.SSH.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

//    @Autowired
//    private UserDao userDao;

    public List<User> getAll(){
        List<User> list=null;

        return list;
    }

    public boolean addUser(User user){
        UserDao userDao=new UserDao();
        userDao.addUser(user);
        return true;
    }

    public boolean updataUser(User user){
        return true;
    }

    public boolean deleteUser(String id){
        return true;
    }
}
