package com.huihuang.feign;

import com.huihuang.service.MemberService;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

@FeignClient("app-huihuang-member")
public interface MemberServiceFeign extends MemberService {

}
