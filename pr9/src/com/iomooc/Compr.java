package com.iomooc;
import java.util.*;
public class Compr implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		 int num=o1.getName().compareTo(o2.getName());
		if(num==0){
			return new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
			
		}
		 return num;
	}

	 
	 

}
