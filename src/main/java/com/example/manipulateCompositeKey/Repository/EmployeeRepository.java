package com.example.manipulateCompositeKey.Repository;

import com.example.manipulateCompositeKey.model.Employee;
import com.example.manipulateCompositeKey.model.EmployeeIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeeIdentity> {

}