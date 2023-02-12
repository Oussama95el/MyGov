package com.simplon;

import com.simplon.model.Department;
import com.simplon.repository.DepartmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
public class FinanceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner demo(DepartmentRepository departmentRepository) {
//		return (args) -> {
//			// write your code here
//			departmentRepository.saveAll(
//					List.of(
//							Department.builder().name("Finance").build(),
//							Department.builder().name("Administration").build(),
//							Department.builder().name("HR").build()
//					)
//			);
//			departmentRepository.findAll().forEach(System.out::println);
//		};
//	}
}
