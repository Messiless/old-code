package com.imooc;

public class Q2 extends Thread {
 Q2(String name){
	super(name); 
 }
 public void run(){
	 for(int i=0;i<12;i++){
	 System.out.println(this.getName()+"              "+i);
 }
 }
}
