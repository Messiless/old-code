package com.imooc;

public class A3 implements Runnable{
	private A1 r;
	A3(A1 r){
		this.r=r;
	}
public void run(){
	while(true){ 
		 
	try {
		r.show();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}			  
	 
 	
	}
}
}
