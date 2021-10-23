package siva.springdao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.springdao.dao.EmpDao;
import siva.springdao.dao.impl.EmpDaoImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ctx = new  ClassPathXmlApplicationContext("applicationContext.xml");
		EmpDao  dao = ctx.getBean("empDaoImpl", EmpDaoImpl.class);
		
		int x=dao.updateEmpsByDept(101, 27000);
		System.out.println(x+" row(s) updated");
		
		System.out.println("================");
		
		System.out.println(dao.findById(1));
		
	    System.out.println("##############");
	    
	    System.out.println(dao.findAll());
	
	}

}
