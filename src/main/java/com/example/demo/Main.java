package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args); }
		/*
		Maintenance maintenance=new Maintenance();
		EmailService emailService=new EmailService();
		Dealer dealer=new Dealer(emailService);
		CarService carService=new CarService(
				maintenance,
				emailService,
				dealer);
		/*

}
