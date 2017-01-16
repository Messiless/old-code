package com.imooc;
public class Z1 implements Runnable {
	 static int tick =40;
	 
	 
public  void run(){
 while(true){
	 {synchronized(this){
	 if(tick>0){
		 try{
			 Thread.sleep(10);
		 }
		 catch(Exception e){}
		 System.out.println(Thread.currentThread().getName()+"          "+tick--);
		 ;
	 }
	 
}
	 }
 }
 }
}

