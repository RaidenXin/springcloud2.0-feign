package com.huihuang.service;

import com.huihuang.entiy.User;
import com.huihuang.feign.MemberServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderServiceImpl implements OrderService{

    @Autowired
    private MemberServiceFeign memberService;
    @Override
    public List<User> getMemberList(String name) {
        return memberService.getUsers(name);
    }
}
