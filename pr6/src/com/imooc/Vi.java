package com.imooc;

public class Vi {
	
 public static int show(int[] arr,int ss) {
	 for(int i=0;i<arr.length;i++){
		 if(arr[i]==ss)
			 return i ;
	 }return -1;
		  
	 
	
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={2,4,34,33,23};
		
		int num=show(arr,30);
		System.out.println(num);
}
}