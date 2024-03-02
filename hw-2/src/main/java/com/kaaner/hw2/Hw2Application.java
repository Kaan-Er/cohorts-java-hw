package com.kaaner.hw2;

import com.kaaner.hw2.entity.Customer;
import com.kaaner.hw2.entity.Order;
import com.kaaner.hw2.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;

@SpringBootApplication
public class Hw2Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw2Application.class, args);
		Customer customer =  new Customer("Kaan", "Er", "kaanerdev@gmail.com", "123456789", "IT", new ArrayList<>(), LocalDate.of(2023, 1,11));
		Product product = new Product("Laptop", 1000.0);
		Order order = new Order(customer, new ArrayList<>());

		order.getProducts().add(product);
		System.out.println(order);


	}

}
