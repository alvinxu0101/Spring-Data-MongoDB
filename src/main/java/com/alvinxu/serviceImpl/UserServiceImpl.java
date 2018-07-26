package com.alvinxu.serviceImpl;

import com.alvinxu.jpa.data.User;
import com.alvinxu.repo.UserRepo;
import com.alvinxu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    /*注入字段*/
    @Autowired
    UserRepo userRepo;

    public List<User> getList() {
        return userRepo.findAll();
    }

    public void updataUser(int id) {
        User user = new User();
        user.setId(1000);
        user.setName("alvinxu");
        user.setAddress("shanghai");
        User users = userRepo.save(user);
        System.out.println(users.getName());

    }

    public void insertUser() {
        User user = new User();
        for (int i = 0; i < 50; i++) {
            user.setId(i);
            user.setName("alvinxu" + i);
            user.setAddress("chongqing" + i);
            /*
            userRepo中的两个方法
             * insert 主键存在会报错
             * save 主键重复会更新
             * */
            User users = userRepo.insert(user);
            System.out.println(users.getId());
        }
    }

    public void deleteUser(int id) {
        User user = new User();
        user.setId(1000);
        userRepo.delete(user);
    }
}
