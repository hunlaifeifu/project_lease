package com.atguigu.lease.common.login;

public class LoginUserHolder {
    public static ThreadLocal<LoginUser> threadLocal = new ThreadLocal<>();

    public static void setLoginUser(LoginUser user) {
        threadLocal.set(user);
    }

    public static LoginUser getLoginUser() {
        return threadLocal.get();
    }

    public static void removeLoginUser() {
        threadLocal.remove();
    }
}
