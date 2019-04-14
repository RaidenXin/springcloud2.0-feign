package com.huihuang.service;

import com.huihuang.entiy.User;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface MemberService {

    @RequestMapping("/getUsers")
    public List<User> getUsers(String name);
}
