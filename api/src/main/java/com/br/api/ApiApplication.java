package com.br.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.error.ErrorController;

@SpringBootApplication
public class ApiApplication implements ErrorController{

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
