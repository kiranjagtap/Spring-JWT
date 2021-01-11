package com.bezkoder.springjwt.springjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.bezkoder.springjwt.springjwt")
public class SpringjwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringjwtApplication.class, args);
	}

}
