package com.imooc;
import java.util.Scanner;
public class Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入各车的数据
    Big f1=new Big("奥迪A4",4,0,500);
    Big f2=new Big("马自达6",4,0,400);
    Big f3=new Big("皮卡雪",4,2,450);
    Big f4=new Big("金龙",20,0,800);
    Big f5=new Big("松花江",0,4,400);
    Big f6=new Big("依维柯",0,20,1000);
    Scanner input=new Scanner(System.in);
    
    System.out.println("欢迎使用汪氏租车系统:");
    System.out.println("您是否要租车:1是 0否");
    	int a=input.nextInt();
    if(a==0){
   	 System.out.println("滚蛋吧你！！！！");
    }
   	 else if(a==1){
   		System.out.println("您可租车类型及其价目表：");
	     System.out.println("序号\t汽车名称\t租金\t\t容量");
	     System.out.println(1+"\t"+f1.getName()+"\t"+f1.getMoney()+"元/天"+"\t"+f1.getPeople()+"人"+"\t"+f1.getThing()+"吨");
	     System.out.println(1+"\t"+f2.getName()+"\t"+f2.getMoney()+"元/天"+"\t"+f2.getPeople()+"人"+"\t"+f2.getThing()+"吨");
	     System.out.println(1+"\t"+f3.getName()+"\t"+f3.getMoney()+"元/天"+"\t"+f3.getPeople()+"人"+"\t"+f3.getThing()+"吨");
	     System.out.println(1+"\t"+f4.getName()+"\t"+f4.getMoney()+"元/天"+"\t"+f4.getPeople()+"人"+"\t"+f4.getThing()+"吨");
	     System.out.println(1+"\t"+f5.getName()+"\t"+f5.getMoney()+"元/天"+"\t"+f5.getPeople()+"人"+"\t"+f5.getThing()+"吨");
	     System.out.println(1+"\t"+f6.getName()+"\t"+f6.getMoney()+"元/天"+"\t"+f6.getPeople()+"人"+"\t"+f6.getThing()+"吨");
	     System.out.println("请输入你要租车的数量：");
	     int score=input.nextInt();
	     String nub1="";
	     String nub2="";
	     String nub3="";
	     String nub4="";
	     String nub5="";
	     String nub6="";
	     int pr=0;
	     int peo=0;
	     int thi=0;
	     for(int o=1;o<=score;o++){
	    	 System.out.println("请输入第"+o+"辆车序号");
	     
	     int ss=input.nextInt();
	     if(ss>=1&&ss<=6){
	     if(ss==1){nub1=f1.getName();
	     pr+=f1.getMoney();
	     peo+=f1.getPeople();
	     thi+=f1.getThing();
	     }
	     
	     if(ss==2){nub2=f2.getName();
	     pr+=f2.getMoney();
	     peo+=f2.getPeople();
	     thi+=f2.getThing();
	     }
	     if(ss==3){nub3=f3.getName();
	     pr+=f3.getMoney();
	     peo+=f3.getPeople();
	     thi+=f3.getThing(); 
	     }
	     if(ss==4){nub4=f4.getName();
	     pr+=f4.getMoney();
	     peo+=f4.getPeople();
	     thi+=f4.getThing(); 
	     
	     if(ss==5){nub5=f5.getName();
	     pr+=f5.getMoney();
	     peo+=f5.getPeople();
	     thi+=f5.getThing();
	     }
	     if(ss==6){nub6=f6.getName();
	     pr+=f6.getMoney();
	     peo+=f6.getPeople();
	     thi+=f6.getThing();
	     }
	     }
	      
	     } else {
	    	 System.out.println("您的输入有误");
	    	 }
	     }
	     
    System.out.println("请输入租车天数：");
    int jk=input.nextInt();
    System.out.println("您的账单：");
    System.out.println("***可载人的车有：");
   System.out.print( nub1+"\t"+nub2+"\t"+nub3+"\t"+nub4+"\t");
   System.out.println("共载人："+peo+"人");
   System.out.println("***载货的车有：");
   System.out.print(nub3+"\t"+nub5+"\t"+nub6+"\t");
   System.out.println("共载货："+thi+"吨");
   pr=pr*jk;
   System.out.println("***租车总价格："+pr+"元");
    
     
   
   
   
   
   	 }
   	 else{
   		 System.out.println("您输出有误");
   	 }
}
   
}
    
    
    
	


