package com.iomooc;
import java.io.*;
public class Tryinput {

	public static void main(String[] args) throws Exception{
		 FileInputStream a2=new FileInputStream("E:\\t1\\l1.txt");
		 //����һ
		 /*
		  int num=0;
		  while((num=a2.read())!=-1){
		  System.out.println((char)num);
		  }
		  a2.close();
		  
		  */
		 //������
		 /*byte arr[]=new byte[1024];
		 int i=0;
		 while((i=a2.read(arr))!=-1){
			 System.out.println(new String(arr,0,i));
		 }*/
		 //������
		 byte[] ass=new byte[a2.available()];
		 a2.read(ass);
		 System.out.println(new String (ass));
	a2.close();
	}
	

}
