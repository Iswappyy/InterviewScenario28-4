package com.collectionmap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
	int id;
	String name;
	String city;
	
	public Employee(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}


	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Kunal","USA");
		Employee e2 = new Employee(2,"Rahul","China");
		Employee e3 = new Employee(3,"Virat","USA");
		
		List<Employee>  l1 = new ArrayList();
		List<Employee>  l2 = new ArrayList();
		List<Employee>  l3 = new ArrayList();
		
		
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		
		for(Employee s1 : l1 ) {
			if(s1.city == "USA") {
				l2.add(s1);
			}
			else {
				if(s1.city == "China") {
					l3.add(s1);
				}
			}
			
		}
			
	Map <String ,List<Employee>> m1 = new HashMap<>();
	
	m1.put("USA", l2);
	m1.put("China", l3);
	
	System.out.println(m1.get("USA"));
	System.out.println(m1.get("China"));
	
	}
}
