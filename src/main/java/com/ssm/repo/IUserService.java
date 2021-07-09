package com.ssm.repo;

import com.ssm.mybatis.bean.User;

public interface IUserService {

    public User getUsersById(Integer id);
}
