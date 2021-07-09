package com.ssm.mybatis.Dao;

import com.ssm.mybatis.bean.User;

import java.util.ArrayList;

public interface UserDao {
    int insert(User user);
    int deleteByPrimaryKey(Integer id);
    int updateUserByUser(User user);
    int updateUserById(Integer id);
    ArrayList<User> selectUserById(Integer id);

}
