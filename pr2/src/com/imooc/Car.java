package com.imooc;

public class Car {
 public int high;
public String name;
public void show(){
	System.out.println("�����߶�:"+high+"��������"+name);
	
}
public Car(){
	System.out.println("�ܺ�����ԵĶ�");
	 name="����";
	
}
@Override
public String toString() {
	return "Car [high=" + high + ", name=" + name + "]";
}

}
