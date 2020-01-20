package com.lesa.springit;

import static org.springframework.boot.SpringApplication.run;

import org.ocpsoft.prettytime.PrettyTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);
	
	public static void main(String[] args) {
		run(SpringitApplication.class, args);
		System.out.println("Welcome to springit!");
	}
	
	@Bean
	PrettyTime prettyTime() {
		return new PrettyTime();
	}
	
}
