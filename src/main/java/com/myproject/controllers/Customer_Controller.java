package com.myproject.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.entities.Customer;

@RestController
@RequestMapping("/")
public class Customer_Controller {
	
	@GetMapping("/cust")
	Customer getCustomer() {
		System.out.println("hello");
		return new Customer(1,"BarunRam");
		
	}
}
