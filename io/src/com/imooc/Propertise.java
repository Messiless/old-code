package com.imooc;
import java.io.*;
import java.util.*;
public class Propertise {
//���ı��ļ�ֵ�Դ浽������ȥ
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
		throw new RuntimeException("�������");
	}
	finally{
		try{if(as!=null){
			as.close();
		}	
			
		}
		catch(IOException e){
			throw new RuntimeException("����");
		}
	}
}
}
