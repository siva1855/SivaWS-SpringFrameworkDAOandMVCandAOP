package siva.springmvc.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import siva.springmvc.dao.EmployeeDao;
import siva.springmvc.mapper.EmployeeMapper;
import siva.springmvc.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getAllEmployees() {
		String sql = "SELECT * FROM EMPAPP";
		List<Employee> employee=jdbcTemplate.query(sql, new EmployeeMapper());
		return employee;
	}

}
