package siva.springdao.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import siva.springdao.batch.EmployeeBatch;
import siva.springdao.dao.EmployeeDAO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public final String query = "insert into empapp values(?,?,?,?)";

	@Override
	public void runBatch() {
		int[] x = jdbcTemplate.batchUpdate(query, new EmployeeBatch());
		System.out.println("Batch executed");
	}

}
