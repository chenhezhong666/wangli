package cn.com.wanglinet.service;

import cn.com.wanglinet.api.User;
import cn.com.wanglinet.entity.AccountUser;
import cn.com.wanglinet.mapper.AccountUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements User {

    @Autowired
    private AccountUserMapper accountUserMapper;

    @Override
    public AccountUser getUserInfo(AccountUser accountUser) {
        return accountUserMapper.selectByPrimaryKey(accountUser.getId());
    }
}
