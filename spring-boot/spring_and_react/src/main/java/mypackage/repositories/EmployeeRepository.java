package mypackage.repositories;

import org.springframework.data.repository.CrudRepository;

import mypackage.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {}