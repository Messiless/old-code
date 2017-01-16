package com.imooc;

public class Computer {
	private int sta=3;
public void run()throws LanpinException,MaoyanException{
     if(sta==2 )
   throw new LanpinException("电脑蓝屏了");
     if(sta==3)
   throw new MaoyanException("电脑冒烟了"); 	 
	System.out.println("电脑运行");
}
public void chongqi(){
	sta=1;
	System.out.println("电脑重启");
	
}
}
