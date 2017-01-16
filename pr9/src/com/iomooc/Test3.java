package com.iomooc;
import java.io.*;
public class Test3 {

	public static void main(String[] args) {
	 FileInputStream s1=null;
	 FileOutputStream s2=null;
	 try{
		 s1=new FileInputStream("E:\\p1.jpeg");
	     s2=new FileOutputStream("E:\\p2.jpeg");
		 byte[] aff=new byte[1024];
		 int im=0;
		 while((im=s1.read(aff))!=-1){
			 s2.write(aff,0,im);
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
