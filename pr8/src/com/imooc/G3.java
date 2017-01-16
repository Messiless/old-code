package com.imooc;
import java.util.*;

public class G3 {

	public static void main(String[] args) {
 HashSet li=new HashSet();
 li.add(new G1("打的",1));
 li.add(new G1("大声道",2));
 li.add(new G1("苏打",4));
 li.add(new G1("苏打",4));
 System.out.println(li.contains(new G1("苏打",3))); 
 Iterator ji=li.iterator();
 while(ji.hasNext()){
	 G1 ho=(G1)ji.next();
	 System.out.println(ho.getName()+"...."+ho.getAge());
 }
 
 
 
 
 
 
 
 
	}

}
