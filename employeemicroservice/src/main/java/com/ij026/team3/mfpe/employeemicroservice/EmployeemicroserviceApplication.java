package com.ij026.team3.mfpe.employeemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.ij026.team3.mfpe.employeemicroservice.model.Employee;

@SpringBootApplication
@EnableFeignClients
public class EmployeemicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemicroserviceApplication.class, args);
	}

}
