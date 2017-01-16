package com.imooc;
import java.util.*;
public class Test3Student implements Comparable<Test3Student> {
	private String name;
	private int n1,n2,n3;
	private int sum;
	Test3Student(String name,int n1,int n2,int n3){
		this.name=name;
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
		sum=n1+n2+n3;
	}
	public String getName(){
		return this.name=name;
	}
	public int getSum(){
		return this.sum=sum;
	}
	public int hashCode(){
		return name.hashCode()+sum*54;
	}
 public boolean euqals(Object s){
	 if(!(s instanceof Test3Student)){
		throw new ClassCastException("¿‡–Õ≤ª∆•≈‰");}
	 Test3Student sd=(Test3Student)s;
	 return this.name.equals(sd.name)&&this.sum==sd.sum;
	 
 }
 public String toString(){
	return name+":"+n1+","+n2+","+n3;
	 
 }
	 
	public int compareTo(Test3Student stu){
		 
		
		int nmm= (new Integer(this.sum).compareTo(new Integer(stu.sum)));
		if(nmm==0){
			return this.name.compareTo(stu.name);
			
		}
		return nmm;
	}
	 

}
