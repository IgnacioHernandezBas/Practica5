package com.Practica5.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // Permite a la aplicacion proporcionar los endpoints
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
