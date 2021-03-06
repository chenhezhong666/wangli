package cn.com.wanglinet.mapper;

import cn.com.wanglinet.entity.AccountUser;
import cn.com.wanglinet.entity.AccountUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountUserMapper {
    int countByExample(AccountUserExample example);

    int deleteByExample(AccountUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AccountUser record);

    int insertSelective(AccountUser record);

    List<AccountUser> selectByExample(AccountUserExample example);

    AccountUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AccountUser record, @Param("example") AccountUserExample example);

    int updateByExample(@Param("record") AccountUser record, @Param("example") AccountUserExample example);

    int updateByPrimaryKeySelective(AccountUser record);

    int updateByPrimaryKey(AccountUser record);
}