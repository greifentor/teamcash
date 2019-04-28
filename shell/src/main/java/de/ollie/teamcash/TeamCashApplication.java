package de.ollie.teamcash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { WebMvcAutoConfiguration.class })
@ComponentScan("de.ollie")
public class TeamCashApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamCashApplication.class, args);
	}

}