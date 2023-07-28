package com.sinking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.sinking.repositories")
@EntityScan("com.sinking.models")
@ComponentScan(basePackages = {"com.sinking"})
public class MatchEndResultSinkingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MatchEndResultSinkingServiceApplication.class, args);
	}

}
