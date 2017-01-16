package com.iomooc;
import java.io.*;
public class Try8 {                               

	public static void main(String[] args) {
	 FileReader k1=null;
	 FileWriter k2=null;
	 
	 try{
		 k1=new FileReader("E:\\demo.txt");
		 k2=new FileWriter("E:\\kemo.txt");
	  char[]arr=new char[1024];
	  int num=0;
	  while((num=k1.read(arr))!=-1){
		  k2.write(arr,0,num);
		  
	 }
	 }
	 catch(IOException e){
	 throw new RuntimeException("¶ÁÐ´Ê§°Ü");
	 }
	 finally{
		 try{if(k1!=null)
			 k1.close();
		 }
		 catch(IOException e){
			 
		 }
		 try{if(k2!=null)
			 k2.close();
		 }
		 catch(IOException e){
		 
		 }
	 }
	}

}
