package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.saveAll(List.of(
					Customer.builder().name("yasmina").email("yasmina@gmail.com").build(),
					Customer.builder().name("malak").email("malak@gmail.com").build(),
					Customer.builder().name("manal").email("manal@gmail.com").build()
			));
			customerRepository.findAll().forEach(System.out::println);
		};
	}
}
