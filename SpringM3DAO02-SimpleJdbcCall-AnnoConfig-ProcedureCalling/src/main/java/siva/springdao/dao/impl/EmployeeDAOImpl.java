package siva.springdao.dao.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import siva.springdao.dao.EmployeeDAO;
import siva.springdao.model.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private SimpleJdbcCall simpleJdbcCall;
	
	  

	@Override
	public Employee getEmployeeNameAndSalaryById(int employeeId) {
		// mysql procedure name-- getEpmloyeeId
		simpleJdbcCall.withProcedureName("getEpmloyeeId");
		MapSqlParameterSource inputMap = new MapSqlParameterSource();
		// mysql procedure intput
		inputMap.addValue("emp_id", employeeId);
		Map<String, Object> outputMap = simpleJdbcCall.execute(inputMap);
		Employee employee = new Employee();
		// mysql procedure output--1
		employee.setEmployeeName((String) outputMap.get("emp_name"));
		// mysql procedure output--2
		employee.setSalary((double) outputMap.get("emp_sal"));
		return employee;
	}

}
