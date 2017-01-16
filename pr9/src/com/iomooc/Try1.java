package com.iomooc;
import java.util.*;
public class Try1 {
public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
	list.add("j");
	list.add("j2");
	list.add("ji4jij");
	list.add("ji56ij");
	System.out.println(list);
	Collections.sort(list,new Tryshow()); 
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);
	//String[]arr={"2","3","2"};
    Integer[]arr={2,3,4};
	List<Integer> po=Arrays.asList(arr);
	System.out.println(po);
	String[]poo={"ko","sda","sadas","sd"};
	List<String> pu=Arrays.asList(poo);
	System.out.println(pu);
	String[]lp=pu.toArray(new String[pu.size()]);
	System.out.println(Arrays.toString(lp));
    for(String de:pu){
    	 
    	System.out.println(de);
    }
	
}
}
