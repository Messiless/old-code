package com.imooc;
import java.util.Scanner;
public class Lsi {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		       Peoplecar car1=new Peoplecar("奥迪A4",500,4,0);
		       Peoplecar car2=new Peoplecar("马自达6",400,4,0);
		       Pickup    car3=new Pickup("皮卡雪6",450,4,2);
		       Peoplecar car4=new Peoplecar("金龙",800,20,0);
		       Goodscar  car5=new Goodscar("松花江",400,0,4);
		       Goodscar  car6=new Goodscar("依维柯",1000,0,20);
		       Scanner input=new Scanner(System.in);
		       System.out.println("欢迎使用答答租车系统：您是否要租车：1是 0否");
		       int choose=input.nextInt();//输入1或者0选择
		       if(choose==1){
		     System.out.println("您可租车类型及其价目表：");
		     System.out.println("序号\t汽车名称\t租金\t\t容量");
		     System.out.println(1+"\t"+car1.getCarName()+"\t"+car1.getPrice()+"元/天"+"\t"+car1.getBusLoad()+"人"+"\t"+car1.getCarGo()+"吨");
		     System.out.println(2+"\t"+car2.getCarName()+"\t"+car2.getPrice()+"元/天"+"\t"+car2.getBusLoad()+"人"+"\t"+car2.getCarGo()+"吨");
		     System.out.println(3+"\t"+car3.getCarName()+"\t"+car3.getPrice()+"元/天"+"\t"+car3.getBusLoad()+"人"+"\t"+car3.getCarGo()+"吨");
		     System.out.println(4+"\t"+car4.getCarName()+"\t"+car4.getPrice()+"元/天"+"\t"+car4.getBusLoad()+"人"+"\t"+car4.getCarGo()+"吨");
		     System.out.println(5+"\t"+car5.getCarName()+"\t"+car5.getPrice()+"元/天"+"\t"+car5.getBusLoad()+"人"+"\t"+car5.getCarGo()+"吨");
		     System.out.println(6+"\t"+car6.getCarName()+"\t"+car6.getPrice()+"元/天"+"\t"+car6.getBusLoad()+"人"+"\t"+car6.getCarGo()+"吨");
		         System.out.println("请输入你要租车的数量：");
		         int score=input.nextInt();//输入要租用的数量信息
		         String nsum1="";//初始化属性
		         String nsum2="";//初始化属性 
		         String nsum3="";//初始化属性
		         String nsum4="";//初始化属性
		         String nsum5="";//初始化属性
		         String nsum6="";//初始化属性
		         int psum=0;//初始化属性
		         double hsum=0;//初始化属性
		         double jsum=0;//初始化属性
		         for(int i=1;i<=score;i++){
		        //通过租用数量信息score定义循环的最大值
		        System.out.println("请输入第"+i+"辆车的序号");
		        int a=input.nextInt();//通过输入选择合适值与入口匹配运算
		        if(a>=1&&a<=6){
		              if(a==1){//输入值等于1时执行下面语句
		           	  nsum1=car1.getCarName();
		           	  jsum+=car1.getPrice();
		                  psum+=car1.getBusLoad();
		              }
		              if(a==2){//输入值等于2时执行下面语句
		           	  nsum2=car2.getCarName();
		           	  jsum+=car2.getPrice();
		                  psum+=car2.getBusLoad();
		              }
		              if(a==3){//输入值等于3时执行下面语句
		           	  nsum3=car3.getCarName();
		           	  jsum+=car3.getPrice();
		                  psum+=car3.getBusLoad();
		                  hsum+=car3.getCarGo();
		              }
		              if(a==4){//输入值等于4时执行下面语句
		           	  nsum4=car4.getCarName();
		           	  jsum+=car4.getPrice();
		                  psum+=car4.getBusLoad();
		              }
		              if(a==5){//输入值等于5时执行下面语句
		           	  nsum5=car5.getCarName();
		           	  jsum+=car5.getPrice();
		                  hsum+=car5.getCarGo();
		              }
		              if(a==6){//输入值等于6时执行下面语句
		           	  nsum6=car6.getCarName();
		                  jsum+=car6.getPrice();
		                  hsum+=car6.getCarGo();
		              }
		        }else{
		        System.out.println("输入值有错误！");
		        System.exit(0);//退出所有程序
		        }
		              }
		         System.out.println("请输入租车天数：");
		         int b=input.nextInt();//租用天数并赋值给b
		         System.out.println("您的账单：");
		         System.out.println("***可载人的车有：");
		         //在此输出只要执行过的再次赋值的载人车辆名称
		         System.out.println(nsum1+"\t"+nsum2+"\t"+nsum3+"\t"+nsum4);
		         System.out.println("共载人："+psum+"人");
		         System.out.println("***载货的车有：");
		         //在此输出只要执行过的再次赋值的载货车辆名称
		         System.out.println(nsum3+"\t"+nsum5+"\t"+nsum6);
		         //因为每次都在相加，所以最后循环出来的就是总量
		         System.out.println("共载货："+hsum+"吨");
		         jsum=jsum*b;//因为价格每次循环没有清零，所以一直相加一起，再此处乘以天数即可
		         System.out.println("***租车总价格："+jsum+"元");
		         }
		         if(choose==0){
		      System.out.println("正在退出系统，欢迎下次再来！");
		       }else{
		      System.out.println("您输入的值有误！");  	  
		       }
		}
}
