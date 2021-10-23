package siva.springdao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import siva.springdao.dao.EmployeeDAO;
import siva.springdao.model.Employee;
import siva.springdao.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public Employee fetchEmployeeNameAndSalaryById(int employeeId) {

		return employeeDAO.getEmployeeNameAndSalaryById(employeeId);
	}

}
