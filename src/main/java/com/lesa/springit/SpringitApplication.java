package com.lesa.springit;

import static org.springframework.boot.SpringApplication.run;

import org.ocpsoft.prettytime.PrettyTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.lesa.springit.controller.LinkController;
import com.lesa.springit.service.BeanUtil;

import bootstrap.DatabaseLoader;
import security.SecurityConfiguration;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackageClasses = {
										LinkController.class,
										BeanUtil.class,
										DatabaseLoader.class,
										SecurityConfiguration.class
									})
public class SpringitApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);
	
	public static void main(String[] args) {
		run(SpringitApplication.class, args);
	}
	
	@Bean
	PrettyTime prettyTime() {
		return new PrettyTime();
	}
	
}
