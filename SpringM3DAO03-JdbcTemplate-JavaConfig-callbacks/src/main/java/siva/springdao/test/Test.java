package siva.springdao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import siva.springdao.config.AppConfig;
import siva.springdao.dao.EmpDao;
import siva.springdao.dao.impl.EmpDaoImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext  ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpDao  dao =ctx.getBean("empDaoImpl", EmpDaoImpl.class);
		dao.findEmployees();

	}

}
