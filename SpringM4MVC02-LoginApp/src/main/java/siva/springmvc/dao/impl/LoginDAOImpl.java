package siva.springmvc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import siva.springmvc.dao.LoginDAO;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final String query = "select  count(*)  from  login  where  username=? and password=?";

	@Override
	public boolean checkUser(String username, String password) {
		int i = jdbcTemplate.queryForObject(query, Integer.class, username, password);
		if (i == 1) {
			return true;
		} else {
			return false;
		}
	}
}
