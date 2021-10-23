package siva.springdao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_details")
public class Person {

	@Id
	@Column(name = "id")
	private int personId;

	@Column(name = "name")
	private String personName;

	@Column(name = "age")
	private int personAge;

	@Column(name = "gender")
	private String personGender;

	@Column(name = "qualification")
	private String personQualification;

	public Person() {
		super();
	}

	public Person(int personId, String personName, int personAge, String personGender, String personQualification) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
		this.personGender = personGender;
		this.personQualification = personQualification;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonGender() {
		return personGender;
	}

	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}

	public String getPersonQualification() {
		return personQualification;
	}

	public void setPersonQualification(String personQualification) {
		this.personQualification = personQualification;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge
				+ ", personGender=" + personGender + ", personQualification=" + personQualification + "]";
	}

}
