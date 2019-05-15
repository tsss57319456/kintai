package com.kintai.kintai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.kintai.kintai")
@SpringBootApplication
public class KintaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KintaiApplication.class, args);
	}

}
