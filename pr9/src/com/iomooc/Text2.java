package com.iomooc;
import java.util.*;
public class Text2 {

	public static void main(String[] args) {
	 HashMap<String,String> q1=new HashMap<String,String>();
	 q1.put("01","zhangsan");
	 q1.put("02", "lisi");
	 HashMap<String,String> q2=new HashMap<String,String>();
	 q2.put("01","huahua");
	 q2.put("02", "caocao");
	 HashMap<String,HashMap<String,String>> q3=new HashMap<String,HashMap<String,String>>();
	 q3.put("æÕ“µ",q2);
	 q3.put("‘§»»", q1);
	Iterator<String> io=q3.keySet().iterator();
	while(io.hasNext()){
		String i1=io.next();
		HashMap<String,String> i2=q3.get(i1);	
           getroom(i2);}
           
	}
	public static void getroom(HashMap<String,String> p){
		Iterator<String> it=p.keySet().iterator();
		while(it.hasNext()){
			String num=it.next();
			String name=p.get(num);
			System.out.println(num+":"+name);
		}
		
	}
}
