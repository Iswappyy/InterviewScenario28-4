package com.collectionmap2;

import java.util.TreeSet;

public class TestDemo {
	public static void main(String[] args) {
		User u1 = new User(100,"Mechanical",13200);
		User u2 = new User(110,"IT",16200);
		User u3 = new User(120,"Banking",18200);
		
		SortByDepartment d1 = new SortByDepartment();
		
		TreeSet<User> t1 = new TreeSet(d1);
		t1.add(u1);
		t1.add(u2);
		t1.add(u3);
		
		System.out.println("Sort by Department: "+t1);
		
		SortBySalary d2 = new SortBySalary();
		
		TreeSet<User> t2 = new TreeSet(d2);
		t2.add(u1);
		t2.add(u2);
		t2.add(u3);
		
		System.out.println("Sort by Salary: "+ t2);
		
		SortById d3 = new SortById();
		
		TreeSet<User> t3 = new TreeSet(d3);
		t3.add(u1);
		t3.add(u2);
		t3.add(u3);
		
		System.out.println("Sort By Id: "+ t3);
	}

}
