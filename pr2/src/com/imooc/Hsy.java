package com.imooc;

public class Hsy {
private String name="imooc";
int age =20;
public class Inner {
	  String name="��Ľ��";
	 public void show(){
		 System.out.println("�ⲿ���е�name:"+Hsy.this.name);
		 System.out.println("�ڲ����е�name:"+name);
		 System.out.println("�ⲿ���е�age:"+age);
	 }
}
public static void main(String[] args){
	Hsy i =new Hsy();
	Inner j=i.new Inner();
	j.show();
}
}