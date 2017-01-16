package com.imooc;
import java.io.*;
public class Try2Person  implements Serializable{
	static final long serialVersionUID = 42L;
   String name;
   int age;
   Try2Person(String name,int age){
	   this.name=name;
	   this.age=age;
   }
   public String toString(){
	   return(name+";"+age);
   }
	
	
	
	
	
}
