package com.iomooc;
import java.io.*;
public class Test4 {

	public static void main(String[] args) {
		 BufferedInputStream s1=null;
		 BufferedOutputStream s2=null;
		 try{
			 s1=new BufferedInputStream(new FileInputStream("E:\\p1.jpeg"));
		     s2=new BufferedOutputStream(new FileOutputStream("E:\\p2.jpeg"));
			 int im=0;
			 while((im=s1.read())!=-1){
				 s2.write(im);
			 }
		 }
	catch(IOException e){
		throw new RuntimeException("∏¥÷∆ ß∞‹");
	}
		 finally{
			 try{
				 if(s1!=null){
					 s1.close();}
				 }
				 catch(IOException e){
					 throw new RuntimeException("∂¡»° ß∞‹");
				 }
				 try{
					 if(s1!=null){
						 s1.close();}
				 }
					 catch(IOException e){
						 throw new RuntimeException("–¥»Î ß∞‹");
					 } 
			 
			 
		 }
		}

	}


 
 