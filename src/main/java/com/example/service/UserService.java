package com.example.service;

import com.example.model.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * create by Rision on 2018/7/3
 */
public interface UserService {
    public List<User> getUser(int userId);
    /*int addUser(User user);

    PageInfo<User> findAllUser(int pageNum, int pageSize);*/
}
