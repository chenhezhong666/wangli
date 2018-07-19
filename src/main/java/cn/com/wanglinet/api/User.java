package cn.com.wanglinet.api;

import cn.com.wanglinet.entity.AccountUser;

public interface User {

    /*
    * 获取用户信息的接口
    */
    public AccountUser getUserInfo(AccountUser accountUser);
}
