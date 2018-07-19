package cn.com.wanglinet;

import cn.com.wanglinet.entity.AccountUser;
import cn.com.wanglinet.mapper.AccountUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WangliApplicationTests {


	@Autowired
	public AccountUserMapper accountUserMapper;
	@Test
	public void contextLoads() {
		AccountUser accountUser = accountUserMapper.selectByPrimaryKey(56l);
		System.out.println(accountUser.getUsername()+"success");
	}

}
