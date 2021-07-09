package com.ssm.controller;

import com.ssm.mybatis.bean.User;
import com.ssm.repo.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("/User")
public class UserController {
    @Resource
    IUserService userService;

    @RequestMapping("/UserList")
    public User getUser(){

        return userService.getUsersById(661);

    }
}
