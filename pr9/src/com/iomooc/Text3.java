package com.iomooc;
import java.util.*;
public class Text3 {
public static void main(String[] args) {
	HashMap<String,List<Person>> w1=new HashMap<String,List<Person>>();
	List e1= new ArrayList();
	List e2=new ArrayList();
	w1.put("yure", e1);
	w1.put("jiare", e2);
    e1.add(new Person("wangwu","01"));
    e1.add(new Person("zhangsan","02"));
    e2.add(new Person("hauhau","01"));
    e2.add(new Person("caocai","01"));
	Iterator<String> r1= w1.keySet().iterator();
	while(r1.hasNext()){
		String r2=r1.next();
		List<Person> r3=w1.get(r2);
		getroom(r3);
	}
}
	public static void getroom(List<Person> list){
		Iterator<Person> it=list.iterator();
		while(it.hasNext()){
			Person num=it.next();
			 
			System.out.println(num);
		}
	}
}
