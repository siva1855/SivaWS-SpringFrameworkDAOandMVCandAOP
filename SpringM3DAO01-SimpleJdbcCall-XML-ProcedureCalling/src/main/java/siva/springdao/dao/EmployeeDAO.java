package siva.springdao.dao;

import siva.springdao.model.Employee;

public interface EmployeeDAO {
	public abstract Employee getEmployeeNameAndSalaryById(int employeeId);
}
