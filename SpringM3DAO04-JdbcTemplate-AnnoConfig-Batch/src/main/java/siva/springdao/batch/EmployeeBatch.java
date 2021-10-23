package siva.springdao.batch;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;

import siva.springdao.model.Employee;

public class EmployeeBatch implements BatchPreparedStatementSetter {

	List<Employee> employeeList = new ArrayList<Employee>();

	public EmployeeBatch() {
		Employee employee1 = new Employee(12, "cherry", 50000, 106);
		Employee employee2 = new Employee(13, "milky", 60000, 107);
		Employee employee3 = new Employee(14, "saidaro", 70000, 108);
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

	}

	@Override
	public void setValues(PreparedStatement ps, int i) throws SQLException {
		ps.setInt(1, employeeList.get(i).getEmployeeNo());
		ps.setString(2, employeeList.get(i).getEmployeeName());
		ps.setInt(3, employeeList.get(i).getEmployeeSalary());
		ps.setInt(4, employeeList.get(i).getEmployeeDeptno());
	}
	@Override
	public int getBatchSize() {
		return 3;
	}

}
