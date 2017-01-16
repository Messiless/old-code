package com.imooc;
import java.util.*;
public class L1 {

	public static void main(String[] args) {
		 TreeSet<Work> ne=new TreeSet<Work> (new Q1()) ;
		 ne.add(new Work("dfdfsd"));
		 ne.add(new Work("dfdfsddfsdf"));
		 ne.add(new Work("dfdfsddfdsfdsfdsfdsfs"));
		 ne.add(new Work("dfdfsddddd"));
		 ne.add(new Work("dfdfsdffffffffff"));
		 show(ne);
		
	}
public static void show(TreeSet<? extends Person> d ){
	Iterator<? extends Person> ji=d.iterator();
	while(ji.hasNext()){
		System.out.println(ji.next().getName());
	}
			
	
}
}
