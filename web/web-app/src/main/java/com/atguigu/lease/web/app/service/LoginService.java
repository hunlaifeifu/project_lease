package com.atguigu.lease.web.app.service;

import com.atguigu.lease.web.app.vo.user.LoginVo;
import com.atguigu.lease.web.app.vo.user.UserInfoVo;

public interface LoginService {
    String login(LoginVo loginVo);

    UserInfoVo getLoginUserById(Long userId);

    void getCode(String phone);
}
