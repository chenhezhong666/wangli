package cn.com.wanglinet.mapper;

import cn.com.wanglinet.entity.AccountRole;
import cn.com.wanglinet.entity.AccountRoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountRoleMapper {
    int countByExample(AccountRoleExample example);

    int deleteByExample(AccountRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AccountRole record);

    int insertSelective(AccountRole record);

    List<AccountRole> selectByExample(AccountRoleExample example);

    AccountRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AccountRole record, @Param("example") AccountRoleExample example);

    int updateByExample(@Param("record") AccountRole record, @Param("example") AccountRoleExample example);

    int updateByPrimaryKeySelective(AccountRole record);

    int updateByPrimaryKey(AccountRole record);
}