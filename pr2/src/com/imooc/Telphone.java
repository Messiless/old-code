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
	 System.out.println("���ҡ��");
}
public Telphone(float po,float pi,float pu){
	if(po<3.5){
		System.out.print("����Ĳ�ֵ�����Զ�����3.5");
	screen=3.5f;
	}else{
	screen=po;}
	cup=pi;
	mes=pu;		
}
	
}

