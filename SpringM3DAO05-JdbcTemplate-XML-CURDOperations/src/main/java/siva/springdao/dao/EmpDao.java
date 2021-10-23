package siva.springdao.dao;

import java.util.List;
import java.util.Map;

public interface EmpDao {
	int   updateEmpsByDept(int deptno, int new_salary);
	Map<String,Object>              findById(int  empno);
	List<Map<String,Object>>   findAll();
}
