package com.imooc;
import java.util.*;
public class MapDemo {
 

public static void main(String[] args) {
	Map<String,String> s=new HashMap<String,String>();
		s.put("01","һ");
		s.put("02","��");
		s.put("03","��");
		s.put("04","si");
	 System.out.println(s.get("01"));
	Collection i=s.values();
	System.out.println(i);
	//System.out.println(s);
//����һ
	Set<String>k=s.keySet();
   for(String fr: k){	
	   System.out.println(fr+"...."+s.get(fr));
   }
	/*Iterator<String> lo=k.iterator();
	while(lo.hasNext()){
		String w=lo.next();
		
	String f=s.get(w);
	System.out.println(w+"...."+f);
	}*/
	//������
	Set<Map.Entry<String, String>> o=s.entrySet();
	Iterator<Map.Entry<String, String>> ll=o.iterator();
      while(ll.hasNext()){
    	  Map.Entry<String, String> a=ll.next();
    	  String yu=a.getKey();
    	  String yi=a.getValue();
    	  System.out.println(yu+"...."+yi);
    			  
      }

}

}
