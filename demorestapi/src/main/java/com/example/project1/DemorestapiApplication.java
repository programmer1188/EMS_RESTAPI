package com.example.project1;

import com.example.project1.model.Employee;
import com.example.project1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemorestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemorestapiApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Suresh");
		employee.setLastName("Kumar");
		employee.setEmailId("suresh@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Ramesh");
		employee1.setLastName("Kumar");
		employee1.setEmailId("ramesh@gmail.com");
		employeeRepository.save(employee1);


	}
}
