package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "findAllEmployees", query = "select e from Employee e") })//Java Persistence Query Language (JPQL)
@Table(name="EMPLOYEE")
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)  
	@Column(name="ID")
	private Integer id;

	@Column(name="FIRSTNAME")
	private String firstname;

	@Column(name="LASTNAME")
	private String lastname;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString(){
		return "id="+id+", firstname="+firstname+", lastname="+lastname;
	}
}