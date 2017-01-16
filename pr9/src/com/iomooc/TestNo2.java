package com.iomooc;
import java.io.*;
public class TestNo2 {

	public static void main(String[] args) throws Exception{
		 BufferedInputStream f1=new BufferedInputStream(new FileInputStream("E:\\k1.txt"));
		 BufferedOutputStream f2=new BufferedOutputStream(new FileOutputStream("E:\\k2.jpeg"));
		 int d=0;
		 while((d=f1.read())!=-1){
			 f2.write(d);
			 
		 }
     
        
f1.close();
f2.close();
 
}

	 
	
}
