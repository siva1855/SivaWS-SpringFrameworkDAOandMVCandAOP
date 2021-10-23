package siva.springmvc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import siva.springmvc.dao.LoginDao;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	private String query = "SELECT  COUNT(*)  FROM  LOGIN  WHERE  USERNAME=? AND PASSWORD=?";

	public boolean checkUser(String username, String password) {
		int i = jdbcTemplate.queryForObject(query, Integer.class, username, password);
		if (i == 1) {
			return true;
		} else {
			return false;
		}
	}
}