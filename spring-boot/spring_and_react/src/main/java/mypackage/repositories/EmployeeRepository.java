package mypackage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mypackage.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {}