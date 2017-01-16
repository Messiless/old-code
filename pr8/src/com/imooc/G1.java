package com.imooc;
 
public class G1 implements Comparable{
private  String name;
private int age;
G1(String name,int age){
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
	return name.hashCode()+20*age;
}
public boolean equals(Object obj){
	
	if(!(obj instanceof G1))
	return false;
	G1 p=(G1)obj;
	
	return this.name.equals(p.name)&&this.age==p.age;
	
}
 
public int compareTo(Object o) {
	 while(!(o instanceof G1) )
		 throw new RuntimeException("输入的不是学生对象啊");
 
	G1 nb=(G1)o;
	//System.out.println(this.name+"........"+nb.name);
	if(this.age>nb.age)
        return 1;
	if(this.age==nb.age)
		return this.name.compareTo(nb.name);
	return -1;
	
}

}
