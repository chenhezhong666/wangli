package cn.com.wanglinet.controller;

import cn.com.wanglinet.entity.AccountUser;
import cn.com.wanglinet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public AccountUser showLogin(Long userId) {
        AccountUser accountUser = new AccountUser();
        accountUser.setId(userId);
        AccountUser userInfo = this.userService.getUserInfo(accountUser);
        return userInfo;
    }

}
