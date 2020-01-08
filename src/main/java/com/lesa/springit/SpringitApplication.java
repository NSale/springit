package com.lesa.springit;

import static org.springframework.boot.SpringApplication.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.lesa.springit.domain.Comment;
import com.lesa.springit.domain.Link;
import com.lesa.springit.repository.CommentRepository;
import com.lesa.springit.repository.LinkRepository;
import com.lesa.springit.repository.VoteRepository;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);
	
	public static void main(String[] args) {
		run(SpringitApplication.class, args);
		System.out.println("Welcome to springit!");
	}
	
//	@Bean
//	CommandLineRunner runner(CommentRepository commentRepository, LinkRepository linkRepository, VoteRepository voteRepository) {
//		return args ->  {
//			Link link = new Link("Getting started with SPring Boot 2", "https://therealdanvega.com/spring-boot-2");
//			linkRepository.save(link);
//			
//			Comment comment = new Comment("This Spring Boot 2 link is awesome!", link);
//			commentRepository.save(comment);
//			
//			link.addComment(comment);
//		};
//	}
	
}
