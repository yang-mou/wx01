package com.xy.wx01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//@MapperScan("com.zking.wx01.mapper")
@EnableTransactionManagement
//@EnableScheduling
public class Wx01Application {

	public static void main(String[] args) {
		SpringApplication.run(Wx01Application.class, args);
	}

}
