package com.iomooc;
import java.util.*;
public class Text1 {
public static void main(String[] args) {
	String inu=charTom("dnsdnfksfnnfdk");
	System.out.println(inu);
	
	
	
	
	
	
	
}
public static String charTom(String ch){
	char[] chs= ch.toCharArray();
	TreeMap<Character,Integer> mx=new  TreeMap<Character,Integer>();
	for(int i=0;i<chs.length;i++){
		Integer jj=mx.get(chs[i]);
		 
		if(jj==null){
			mx.put(chs[i], 1);
		}
		else{
			jj++;
			mx.put(chs[i], jj);
			}
		}
		HashSet fu=new HashSet();
		Set<Character> sd=mx.keySet();
		Iterator<Character> ij=mx.keySet().iterator();
		while(ij.hasNext()){
			Character lp=ij.next();
			Integer b1=mx.get(lp);
			fu.add(lp+"("+b1+")");
		}
		return fu.toString();
	
 
	 
	
}
}
