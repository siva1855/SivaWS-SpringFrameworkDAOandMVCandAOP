package siva.springdao.test;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import siva.springdao.dao.PersonDAO;
import siva.springdao.entity.Person;

public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("PersonConfig.xml");
		PersonDAO personDAO = (PersonDAO) ctx.getBean("personDAOImpl");
		System.out.println(personDAO.getClass().getName());
		System.out.println("................................................");
		Person person = new Person(1, "siva", 27, "male", "M-Tech");
		//personDAO.savePerson(person);
		//personDAO.updatePerson(person);
		//personDAO.deletePersonById(1);
		//System.out.println(personDAO.findPersonById(1));
		System.out.println(personDAO.findAll());
	}
}
