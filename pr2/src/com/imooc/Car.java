package com.imooc;

public class Car {
 public int high;
public String name;
public void show(){
	System.out.println("汽车高度:"+high+"汽车名字"+name);
	
}
public Car(){
	System.out.println("很好你可以的额");
	 name="三菱";
	
}
@Override
public String toString() {
	return "Car [high=" + high + ", name=" + name + "]";
}

}
