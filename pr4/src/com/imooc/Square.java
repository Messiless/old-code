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
     System.out.println("矩形周长为:"+(b+c)*2);
	}

	@Override
	public void mianji() {
		// TODO Auto-generated method stub
System.out.println("矩形面积为:"+b*c);
	}

}
