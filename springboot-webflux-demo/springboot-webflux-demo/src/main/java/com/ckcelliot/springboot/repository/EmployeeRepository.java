package com.ckcelliot.springboot.repository;

import com.ckcelliot.springboot.entity.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String> {
}
