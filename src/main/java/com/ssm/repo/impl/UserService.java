package com.ssm.repo.impl;

import com.ssm.mybatis.bean.User;
import com.ssm.repo.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserService implements IUserService {
    @Resource
    private User user;
    @Override
    public User getUsersById(Integer id) {
        return getUsersById(id);
    }
}
