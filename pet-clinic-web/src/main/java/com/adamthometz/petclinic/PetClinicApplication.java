package com.adamthometz.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetClinicApplication {
	public static void main(String[] args) {
		System.out.println("Hello!");
		SpringApplication.run(PetClinicApplication.class, args);
	}
}
