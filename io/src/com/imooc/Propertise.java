package com.imooc;
import java.io.*;
import java.util.*;
public class Propertise {
//将文本的键值对存到集合中去
	public static void main(String[] args) {
		 getk();
		 
	}
public static void getk(){
	BufferedReader as=null;
	Properties ni=null;
	try {as=new BufferedReader(new FileReader("e:\\nima.txt"));
	ni=new Properties();
		String m1=null;
		while((m1=as.readLine())!=null){
			String[]xi=m1.split("=");
			ni.setProperty(xi[0], xi[1]);
			 
		}
		System.out.println(ni);
	}
	catch(IOException e){
		throw new RuntimeException("程序错误");
	}
	finally{
		try{if(as!=null){
			as.close();
		}	
			
		}
		catch(IOException e){
			throw new RuntimeException("报错");
		}
	}
}
}
