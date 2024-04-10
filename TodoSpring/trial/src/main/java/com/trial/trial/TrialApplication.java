package com.trial.trial;

import com.trial.trial.entity.entity;
import com.trial.trial.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TrialApplication.class, args);
	}


	@Autowired
	private repository repo1;

	@Override
	public void run(String... args) throws Exception {

//		entity e1 = new entity("kartik", "kumar", "kartik12345@gmail.com");
//		repo1.save(e1);
//
//		entity e2 = new entity("pankaj", "kumar", "pankaj@gmail.com");
//		repo1.save(e2);
//
//		entity e3 = new entity("priyavrat", "sharma", "priyavrat@gmail.com");
//		repo1.save(e3);
//
//		entity e4 = new entity("ritik", "shukla", "ritik@gmail.com");
//		repo1.save(e4);
	}
}
