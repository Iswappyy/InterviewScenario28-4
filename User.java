package com.collectionmap2;

public class User {
	int id;
	String department;
	int salary;
	
	public User() {
		super();
	}

	public User(int id, String department, int salary) {
		super();
		this.id = id;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", department=" + department + ", salary=" + salary + "]";
	}
	
}