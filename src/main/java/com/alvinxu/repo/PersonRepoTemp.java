package com.alvinxu.repo;

import com.alvinxu.jpa.data.Person;

import java.util.List;
import java.util.Map;

public interface PersonRepoTemp {
    /*添加数据*/
    public void insertBase(Person object);

    /*根据条件查找数据，返回*/
    public Person findOne(Map<String, Object> parm);

    /*根据条件查询所有数据*/
    public List<Person> findAll(Map<String, Object> parm);

    /*更新*/
    public void update(Map<String, Object> parm);

    /*删除*/
    public void remove(Map<String, Object> parm);
}
