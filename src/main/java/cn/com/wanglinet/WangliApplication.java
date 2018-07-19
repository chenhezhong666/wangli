package cn.com.wanglinet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.com.wanglinet.mapper")
@SpringBootApplication
public class WangliApplication {

	public static void main(String[] args) {
		SpringApplication.run(WangliApplication.class, args);
	}
}
