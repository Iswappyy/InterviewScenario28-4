package com.collectionmap2;

import java.util.Comparator;

public class SortBySalary implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		
		if(o1.salary==o2.salary) {
			return 0;
		}
	 else if(o1.salary > o2.salary) {
		 return -1;
			
		}
	 else {
		 return 1;
	 }
	}

	

	
	
	
	

}
