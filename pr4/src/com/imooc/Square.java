package com.imooc;

public class Square extends Shape {
double b;
double c;
public Square(double b,double c){
	this.b=b;
	this.c=c;
}
	@Override
	public void zhouchang() {
		// TODO Auto-generated method stub
     System.out.println("�����ܳ�Ϊ:"+(b+c)*2);
	}

	@Override
	public void mianji() {
		// TODO Auto-generated method stub
System.out.println("�������Ϊ:"+b*c);
	}

}
