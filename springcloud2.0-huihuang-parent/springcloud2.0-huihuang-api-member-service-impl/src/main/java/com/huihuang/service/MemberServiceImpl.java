package com.huihuang.service;

import com.huihuang.entiy.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MemberServiceImpl implements MemberService{

    @Override
    public List<User> getUsers(String name) {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setId("1");
        user1.setAge(12);
        user1.setName("zhangsan");
        User user2 = new User();
        user2.setId("2");
        user2.setAge(20);
        user2.setName("lisi");
        users.add(user1);
        users.add(user2);
        return users;
    }
}
