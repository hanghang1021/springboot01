package com.qf.springboot01.dao;

import com.qf.springboot01.entity.Users;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository
public interface UserDao {
    List<Users> getList();
}
