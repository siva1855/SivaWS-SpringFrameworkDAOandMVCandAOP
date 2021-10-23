package siva.springdao.callbacks;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import siva.springdao.model.Employee;

public class EmpExtractor implements ResultSetExtractor<Set<Employee>> {
	public Set<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		int count = 1;
		Set<Employee> empSet = new LinkedHashSet<Employee>();
		while (rs.next()) {
			// logic--to print odd numbers only
			if (count % 2 != 0) {
				Employee e = new Employee();
				e.setEmpno(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setSalary(rs.getDouble(3));
				e.setDeptno(rs.getInt(4));
				empSet.add(e);
			}
			count++;

		}
		return empSet;
	}

}
