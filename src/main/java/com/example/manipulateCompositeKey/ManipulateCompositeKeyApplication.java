package com.example.manipulateCompositeKey;

import com.example.manipulateCompositeKey.Repository.EmployeeRepository;
import com.example.manipulateCompositeKey.model.Employee;
import com.example.manipulateCompositeKey.model.EmployeeIdentity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManipulateCompositeKeyApplication  implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(ManipulateCompositeKeyApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// Cleanup employees table
		employeeRepository.deleteAllInBatch();

		// Insert a new Employee in the database
		Employee employee = new Employee(new EmployeeIdentity("E-123", "D-457"),
				"Rajeev Kumar Singh",
				"rajeev@callicoder.com",
				"+91-9999999999");

		employeeRepository.save(employee);
	}
}
