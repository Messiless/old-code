package com.imooc;

public class Z2 {

	public static void main(String[] args) {
		 Z1 t =new Z1();
		 Thread t1=new Thread(t);
	     Thread t2=new Thread(t); 
		 Thread t3 =new Thread(t);
		 t1.start();
		 t2.start();
		 t3.start();
	}
}
