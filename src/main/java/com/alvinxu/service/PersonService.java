package com.alvinxu.service;

import com.alvinxu.jpa.data.Person;

import java.util.List;
import java.util.Map;

public interface PersonService {
    /*添加数据*/
    public void insertBase();

    /*根据条件查找数据，返回*/
    public Person findOne();

    /*根据条件查询所有数据*/
    public List<Person> findAll();

    /*更新*/
    public void update();

    /*删除*/
    public void remove();

}
