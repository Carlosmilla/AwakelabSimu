package com.simAw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SimAw2Application {

	public static void main(String[] args) {
		SpringApplication.run(SimAw2Application.class, args);
	}

}
