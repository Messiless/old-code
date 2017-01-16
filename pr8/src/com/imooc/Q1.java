package com.imooc;
import java.util.*;
public class Q1 implements Comparator<Person> {

	 
	public int compare(Person o1, Person o2) {
 
		return o1.getName().compareTo(o2.getName());
	}

}
