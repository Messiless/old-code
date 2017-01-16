package com.iomooc;
import java.util.*;
public class W1 {

	public static void main(String[] args) {
		 TreeMap<Student, String> oj=new TreeMap<Student, String>(new Compr());
			 oj.put(new Student("zhangsan",20),"beijing");
			 oj.put(new Student("lisi",34),"shanghai");
			 oj.put(new Student("wangwu1",21),"beijing");
			 oj.put(new Student("wangwu2",21),"sdsa");
			 oj.put(new Student("leiliu",21)," hangzhou");
		 /*Set<Student> ji=oj.keySet();
		 Iterator<Student> hu=ji.iterator();
		 while(hu.hasNext()){
         Student hi=hu.next();
         String k=oj.get(hi);
         System.out.println(hi+">....."+k);
	}*/
		Set<Map.Entry<Student, String>>de = oj.entrySet();
        Iterator<Map.Entry<Student, String>> ks=de.iterator();
        while(ks.hasNext()){
        	Map.Entry<Student, String> we=ks.next();
        	Student sd=we.getKey();
        	String ko=we.getValue();
        	System.out.println(sd+"...."+ko);
        }
	}
}
