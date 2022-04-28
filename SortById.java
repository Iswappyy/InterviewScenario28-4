package com.collectionmap2;

import java.util.Comparator;

public class SortById implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		if(o1.id == o2.id) {
		return 0;
	}
		else if(o1.id > o2.id) {
			return 1;
		}
		else {
			return -1;
		}
	

}
}