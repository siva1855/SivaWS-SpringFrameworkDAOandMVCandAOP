package siva.springdao.dao.impl;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import siva.springdao.dao.EmpDao;

@Repository
public class EmpDaoImpl implements EmpDao {
	@Autowired
	JdbcTemplate  jdbcTemplate;
	static   final String UPDATE_QUERY="update  employee  set  new_salary=?  where  deptno=?";
	static   final String SELECT_QUERY="select  *  from  employee  where  empno=?";
	static   final  String  SELECT_QUERY_ALL="select  *  from  employee";

	public int updateEmpsByDept(int deptno, int new_salary) {
		return  jdbcTemplate.update(UPDATE_QUERY,new_salary,deptno);
	}

	public Map<String, Object> findById(int empno) {
		
		return  jdbcTemplate.queryForMap(SELECT_QUERY, empno);
	}

	public List<Map<String, Object>> findAll() {
		return  jdbcTemplate.queryForList(SELECT_QUERY_ALL);
	}

	

}
