package com.collectionmap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test1 {
public static void main(String[] args) {
	Employee1 e1= new Employee1(10,"Ram");
	Employee1 e2= new Employee1(20,"Shyam");
	Employee1 e3= new Employee1(30,"Tom");
	
	ArrayList al1 = new ArrayList();
	ArrayList al2 = new ArrayList();
	ArrayList al3 = new ArrayList();
	al1.add(9405652118L);
	al2.add(8405652120L);
	al3.add(7405652122L);
	
	HashMap<Employee1,ArrayList> hm =new HashMap();
	hm.put(e1,al1);
	hm.put(e2,al2);
	hm.put(e3,al3);
	
	Set<Map.Entry<Employee1,ArrayList>> entries = hm.entrySet();
	 
    Iterator<Map.Entry<Employee1,ArrayList>> itr = entries.iterator();
    while(itr.hasNext()) {
    	Map.Entry<Employee1,ArrayList> entry = itr.next();
    	System.out.println("Key: " + entry.getKey() + "Values: "+ entry.getValue());
    }
    
    
	
	
}
}
