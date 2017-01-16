package com.imooc;

public class Hsy {
private String name="imooc";
int age =20;
public class Inner {
	  String name="爱慕课";
	 public void show(){
		 System.out.println("外部类中的name:"+Hsy.this.name);
		 System.out.println("内部类中的name:"+name);
		 System.out.println("外部类中的age:"+age);
	 }
}
public static void main(String[] args){
	Hsy i =new Hsy();
	Inner j=i.new Inner();
	j.show();
}
}