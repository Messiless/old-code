package com.imooc;
import java.util.Scanner;
import java.util.Arrays;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jsm qq =new Jsm();
     Scanner input=new Scanner(System.in);
   
     System.out.println("欢迎使用汪氏租车系统:");
     System.out.println("您是否要租车:1是 0否");
     	int a=input.nextInt();
     if(a==0){
    	 System.out.println("滚蛋吧你！！！！");
     }else if(a==1){
    		 System.out.println("序号      汽车名称       租金                容量");
    		 System.out.println("1.  奥迪A4  500元/天     载人:4人  ");
    		 System.out.println("2.  马自达6  400元/天    载人:4人  ");
    		 System.out.println("3.  皮卡雪6  450元/天    载人:4 载货:2吨");
    		 System.out.println("4.  金龙               800元/天     载人:20人       ");
    		 System.out.println("5.  松花江          400元/天     载货:4吨");
    		 System.out.println("6.  依维柯          1000元/天  载货:20吨");
     }else{
    	 System.out.println("输入错误");
     }
     System.out.println("请输入您要租汽车的数量:");
     int b =input.nextInt();
     for(int c=1;c<=b;c++){
    	 System.out.println("请输入第"+c+"辆车的序号");
    	 int d=input.nextInt();
    	 if(d>6||d<=0){
    		 System.out.println("输出有误，重新输入");
    		 break;
    	 }else{
     
     System.out.println("输入租车天数:");}
     }
     int e=input.nextInt();
     System.out.println("您的账单:");
     System.out.println("****可载人的车有:");
     
    		
	}

}
