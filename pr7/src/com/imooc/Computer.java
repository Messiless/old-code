package com.imooc;

public class Computer {
	private int sta=3;
public void run()throws LanpinException,MaoyanException{
     if(sta==2 )
   throw new LanpinException("����������");
     if(sta==3)
   throw new MaoyanException("����ð����"); 	 
	System.out.println("��������");
}
public void chongqi(){
	sta=1;
	System.out.println("��������");
	
}
}
