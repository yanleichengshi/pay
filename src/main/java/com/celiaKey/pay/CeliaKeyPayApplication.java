package com.celiaKey.pay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class CeliaKeyPayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CeliaKeyPayApplication.class, args);
		System.out.println("------------ 启动成功 pay -------------");
	}

}
