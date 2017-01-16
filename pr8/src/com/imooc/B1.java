package com.imooc;

public class B1 {
 public static int getCount(String arr,String key){
	int count=0;
	int sount=0;
	while((count=arr.indexOf(key,count))!=-1){
		 count=count+key.length();
		System.out.println(arr);
		sount++;
		
	}
	 
	 
	 
	 return sount;
 }
}





 
 
