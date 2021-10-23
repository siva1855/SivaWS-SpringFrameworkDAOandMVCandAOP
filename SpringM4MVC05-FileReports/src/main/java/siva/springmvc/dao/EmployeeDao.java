package siva.springmvc.dao;

import java.util.List;

import siva.springmvc.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
}
