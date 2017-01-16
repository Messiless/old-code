package com.imooc;

public class hello {
	 public int getMaxAge() {
		 int[]age={18,23,21,19,25,29,17};
	    int max=age[0];
	    for(int i=0;i<=age.length;i++){
	        if(age[i]>max);{
	            
	        max=age[i];}
	    } 
	    return max;
		}
  public static void main(String[] args) {
		hello hell = new hello(); 
		int maxScore=hell.getMaxAge();
		System.out.println("最大年龄为：" + maxScore); 
	}
  

}
