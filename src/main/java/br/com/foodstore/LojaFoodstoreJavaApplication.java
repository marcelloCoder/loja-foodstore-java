package br.com.foodstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.com.foodstore.model")
public class LojaFoodstoreJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaFoodstoreJavaApplication.class, args);
	}

}
