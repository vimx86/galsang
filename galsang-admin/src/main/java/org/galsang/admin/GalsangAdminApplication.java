package org.galsang.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"org.galsang.admin.base.dao"})
@SpringBootApplication
public class GalsangAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalsangAdminApplication.class, args);
	}
}
