package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.company","com.company"})
public class ResumeWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeWebAppApplication.class, args);
	}

}
