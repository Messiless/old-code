package com.iomooc;
import java.util.*;
/*
ÿһ��ѧ�����ж�Ӧ�Ĺ����ء�
ѧ��Student����ַString��
ѧ�����ԣ����������䡣
ע�⣺������������ͬ����Ϊͬһ��ѧ����
��֤ѧ����Ψһ�ԡ�
1������ѧ����
2������map��������ѧ����Ϊ������ַ��Ϊֵ�����롣
3����ȡmap�����е�Ԫ�ء�
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
		 throw new RuntimeException("��������");
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
