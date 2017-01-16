package com.imooc;

public class Circle extends Shape {
	double a;
public Circle(double a){
	this.a=a;
}
	@Override
	public void zhouchang() {
		// TODO Auto-generated method stub
System.out.println("圆周长为:"+3.14*a);
	}

	@Override
	public void mianji() {
		// TODO Auto-generated method stub
System.out.println("圆面积为:"+3.14*(a/2)*(a/2));
	}

}
