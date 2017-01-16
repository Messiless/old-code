package com.iomooc;
import java.util.*;
/*
每一个学生都有对应的归属地。
学生Student，地址String。
学生属性：姓名，年龄。
注意：姓名和年龄相同的视为同一个学生。
保证学生的唯一性。
1，描述学生。
2，定义map容器。将学生作为键，地址作为值。存入。
3，获取map集合中的元素。
*/
public class Student implements Comparable {
private String name;
private int age;
Student (String name,int age){
	this.name=name;
	this.age=age;
}
public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public int hashCode(){
	return name.hashCode()+age*39;
}
public boolean equals (Object obj){
	while(!(obj instanceof Student))
	return false;
Student k=(Student)obj;
return this.getName().equals(k.getName())&&this.getAge()==k.getAge();  
}
@Override
public int compareTo(Object o) {
	 while(!(o instanceof Student)){
		 throw new RuntimeException("输入有误");
	 }
	 Student h=(Student)o;
 
	 if (this.age==h.age)
	return this.name.compareTo(h.name);
	 if(this.age>h.age)
		 return 1;
	 return -1;
}

	public String toString(){
		return name+":"+age;
	}
	
	
	
	
	
	
	
	
}
