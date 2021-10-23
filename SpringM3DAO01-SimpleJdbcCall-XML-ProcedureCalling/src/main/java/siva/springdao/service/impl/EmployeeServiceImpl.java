package siva.springdao.service.impl;

import siva.springdao.dao.EmployeeDAO;
import siva.springdao.model.Employee;
import siva.springdao.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	public Employee fetchEmployeeNameAndSalaryById(int employeeId) {

		return employeeDAO.getEmployeeNameAndSalaryById(employeeId);
	}

}
