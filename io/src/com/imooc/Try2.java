package com.imooc;
import java.io.*;
public class Try2 {
	public static void main(String[] args)throws Exception {
		showlo();
		showpo();
		 
		
	}
	public static void showpo()throws Exception{
		ObjectInputStream x2=new ObjectInputStream(new FileInputStream("e:\\try.txt"));
		   
		Try2Person  x3=(Try2Person)x2.readObject();
		 
		 System.out.println(x3);
		 x2.close();
		  
	}
	public static void showlo()throws Exception{
		ObjectOutputStream x1=new ObjectOutputStream (new FileOutputStream("e:\\try.txt"));
		x1.writeObject(new Try2Person("zhangsan",34));
		x1.writeObject(new Try2Person("wangwu",32));
	 
		x1.close();
		
	}
}
