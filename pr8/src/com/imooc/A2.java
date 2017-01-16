package com.imooc;

public class A2 implements Runnable {
	 private A1 r;
	A2(A1 r){
		this.r=r;
	}
	
public void  run(){
	int x=0;
	while(true) {
	 
		if(x==0){
			 
			try {
				r.set("Á¥Êé", "ÄÐ");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		}if(x==1){
	        try {
				r.set("jack", "boy");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		x=(x+1)%2;
		 
	}
}
}


