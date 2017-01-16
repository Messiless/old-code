package com.imooc;

public class Telphone {
	private float screen;
	private float cup;
	private float mes;
	public float getScreen(){
		return screen;
	}
	public void setScreen(float newScreen){
		screen=newScreen;
	}
public Telphone(){
	 System.out.println("这很摇摆");
}
public Telphone(float po,float pi,float pu){
	if(po<3.5){
		System.out.print("输出的参值有误，自动输入3.5");
	screen=3.5f;
	}else{
	screen=po;}
	cup=pi;
	mes=pu;		
}
	
}

