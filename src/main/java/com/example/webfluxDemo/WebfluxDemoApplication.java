package com.example.webfluxDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;
//https://docs.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-data-r2dbc-with-azure-postgresql
//dont add @EnableWebFlux as it disable the default configrations
//https://stackoverflow.com/questions/51843344/what-is-the-function-of-the-enablewebflux-annotation
//https://auth0.com/blog/introduction-getting-started-with-spring-webflux-api/
//https://stackify.com/reactive-spring-5/
//https://www.javaworld.com/article/3288219/mastering-spring-framework-5-part-2-spring-webflux.html?page=3
@SpringBootApplication
public class WebfluxDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxDemoApplication.class, args);
	}

}
