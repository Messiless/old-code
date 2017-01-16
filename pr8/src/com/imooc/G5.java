package com.imooc;

import java.util.*;

public class G5 implements Comparator<String>{

 
	public int compare(String o1, String o2) {
		  
		int num= o1.length()-(o2.length());
		
		if(num==0){
		return o1.compareTo(o2);
		}
		if(num>0){
			return 1;}
		return -1;
		
		
		
	}
  
	
	
	
	
}
