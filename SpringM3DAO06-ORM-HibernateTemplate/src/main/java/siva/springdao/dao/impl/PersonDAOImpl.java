package siva.springdao.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import siva.springdao.dao.PersonDAO;
import siva.springdao.entity.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public void savePerson(Person person) {
		hibernateTemplate.save(person);
	}

	@Transactional
	@Override
	public void updatePerson(Person person) {
		hibernateTemplate.update(person);
	}

	@Transactional
	@Override
	public void deletePersonById(int id) {
		hibernateTemplate.delete(findPersonById(id));
	}

	@Override
	public Person findPersonById(int id) {
		return hibernateTemplate.get(Person.class, id);
	}

	@Override
	public List<Person> findAll() {
		return hibernateTemplate.loadAll(Person.class);
	}

}
