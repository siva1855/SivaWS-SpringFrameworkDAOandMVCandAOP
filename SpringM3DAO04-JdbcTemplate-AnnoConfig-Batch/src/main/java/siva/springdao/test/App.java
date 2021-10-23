package siva.springdao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import siva.springdao.config.AppConfig;
import siva.springdao.dao.EmployeeDAO;
import siva.springdao.dao.impl.EmployeeDAOImpl;

public class App {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeDAO employeeDAO = applicationContext.getBean("employeeDAOImpl", EmployeeDAOImpl.class);
		employeeDAO.runBatch();
	}
}
