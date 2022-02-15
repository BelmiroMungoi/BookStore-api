package com.bbm.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BookStoreApiApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApiApplication.class, args);
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// Libera o acesso aos End-Points da API
		registry.addMapping("/**")
		.allowedMethods("*")// libera quais metodos https(GET, POST, etc) podem ser acessados
				.allowedOrigins("*");// libera o acesso para requisicoes de outros servers
	}

}
