package siva.springdao.dao;

import java.util.List;

import siva.springdao.entity.Person;

public interface PersonDAO {

	public void savePerson(Person person);

	public void updatePerson(Person person);

	public void deletePersonById(int id);

	public Person findPersonById(int id);

	public List<Person> findAll();

}
