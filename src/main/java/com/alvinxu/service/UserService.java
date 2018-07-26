package com.alvinxu.service;

import com.alvinxu.jpa.data.User;

import java.util.List;

public interface UserService {
    /*查询*/
    public List<User> getList();

    /*增加*/
    public void updataUser(int id);

    /*插入*/
    public void insertUser();

    /*删除*/
    public void deleteUser(int id);
}
