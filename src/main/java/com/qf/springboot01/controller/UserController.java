package com.qf.springboot01.controller;

import com.qf.springboot01.dao.UserDao;
import com.qf.springboot01.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;
@RequestMapping("get")
    public List<Users> getList(){
        List<Users> list = userDao.getList();
        return list;
    }
}
