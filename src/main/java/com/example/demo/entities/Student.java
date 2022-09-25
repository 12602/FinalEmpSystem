package com.example.demo.entities;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="student")
@Table
public class Student {
	public Student()
	{
		
	}

	public Student( String name, String email, String address, int age) {
		super();

		this.name = name;
		this.email = email;
		this.address = address;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int  id;
	private String name;
	private String email;
	private String address;
	private int age;
}
