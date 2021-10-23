package siva.springdao.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import siva.springdao.callbacks.EmpExtractor;
import siva.springdao.callbacks.EmpMapper;

import siva.springdao.dao.EmpDao;

@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void findEmployees() {
		System.out.println(jdbcTemplate.query("select  *  from   empapp", new EmpMapper()));
		System.out.println("...................ResultSetExtractor (To Print ODD Records only).......................");
		System.out.println(jdbcTemplate.query("select  *  from   empapp", new EmpExtractor()));
	}

}
