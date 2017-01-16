package com.imooc;
import java.io.*;
//将输入流传到集合，在回到输出流中
import java.util.*;
public class Propertise1 {
public static void main(String[] args)	 throws IOException{
	showhi();
}
public static void showhi()throws IOException{
	File c1=new File("E:\\count.ini");
	if(!c1.exists()){
		c1.createNewFile();}
	FileInputStream sd=new FileInputStream(c1);
	Properties jk=new Properties();
	jk.load(sd);
	int i=0;
	String num=jk.getProperty("time");
	if(num!=null){
		i=Integer.parseInt(num);
		if(i==5){
			System.out.println("qusi");
			return;}
	}
	i++;
	jk.setProperty("time", i+"");	
	FileOutputStream po=new FileOutputStream(c1);
	jk.store(po,"");
	sd.close();
	po.close();
}
}
