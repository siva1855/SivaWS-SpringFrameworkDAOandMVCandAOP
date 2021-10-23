package siva.springdao.callbacks;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import siva.springdao.model.Employee;

public class EmpMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setEmpno(rs.getInt(1));
		e.setEname(rs.getString(2));
		e.setSalary(rs.getDouble(3));
		e.setDeptno(rs.getInt(4));

		return e;
	}

}
