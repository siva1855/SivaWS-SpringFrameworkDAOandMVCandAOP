package siva.springdao.service;

import siva.springdao.model.Employee;

public interface EmployeeService {
	
	public abstract Employee fetchEmployeeNameAndSalaryById(int employeeId);

}
