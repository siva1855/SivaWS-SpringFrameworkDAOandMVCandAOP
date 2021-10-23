package siva.springdao.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.springdao.model.Employee;
import siva.springdao.service.EmployeeService;
import siva.springdao.service.impl.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
       //spring container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		// EmployeeService interface = EmployeeServiceImpl class
		EmployeeService employeeService = ctx.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
		// Employee model class Object
		Employee employee = employeeService.fetchEmployeeNameAndSalaryById(101);
		// read data
		System.out.println("Employee Name :: " + employee.getEmployeeName());
		System.out.println("Employee Salary :: " + employee.getSalary());

	}

}
