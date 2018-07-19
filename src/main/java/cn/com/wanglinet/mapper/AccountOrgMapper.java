package cn.com.wanglinet.mapper;

import cn.com.wanglinet.entity.AccountOrg;
import cn.com.wanglinet.entity.AccountOrgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AccountOrgMapper {
    int countByExample(AccountOrgExample example);

    int deleteByExample(AccountOrgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AccountOrg record);

    int insertSelective(AccountOrg record);

    List<AccountOrg> selectByExample(AccountOrgExample example);

    AccountOrg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AccountOrg record, @Param("example") AccountOrgExample example);

    int updateByExample(@Param("record") AccountOrg record, @Param("example") AccountOrgExample example);

    int updateByPrimaryKeySelective(AccountOrg record);

    int updateByPrimaryKey(AccountOrg record);
}