package com.collectionmap2;

import java.util.Comparator;

public class SortByDepartment implements Comparator<User>{

	@Override
	public int compare(User u1, User u2) {
		
		
		return u1.department.compareTo(u2.department);
	}

}
