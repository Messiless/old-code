package com.imooc;
import java.util.*;

public class F3 {
public  static ArrayList show(ArrayList x){
	ArrayList x1=new ArrayList();
	Iterator it= x.iterator();
	while(it.hasNext()){
		Object obj=it.next();
		if(!x1.contains(obj)){
			x1.add(obj);
		}
	}
	
	
	
	
	
	
	return x1;
}
	
	
	
	
	
	
	
	
	
}
