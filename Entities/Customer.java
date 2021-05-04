package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity {
	
	public int id;
	public String firstName;
	public String lastName;
	public String dateOfBirth;
	public String nationalyId;
	
	public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationalyId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalyId = nationalyId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalyId() {
		return nationalyId;
	}

	public void setNationalyId(String nationalyId) {
		this.nationalyId = nationalyId;
	}
	
}
