package com.innovation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InnovationApplication implements CommandLineRunner {

	@Autowired
	private UsersRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(InnovationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//repository.deleteAll();

		// save a couple of customers
		//repository.save(new Users("Alice"));

		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Users user : repository.findAll()) {
			System.out.println(user);
		}
		System.out.println();

	}
}
