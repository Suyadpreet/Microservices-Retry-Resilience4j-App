package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesRetryResilience4jAppApplication
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroservicesRetryResilience4jAppApplication.class, args);
		System.out.println("SpringBoot @Retry Resilience4j has been started Successfully.......");
	}

}
