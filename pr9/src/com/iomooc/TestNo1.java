package com.iomooc;
import java.io.*;
public class TestNo1 {

	public static void main(String[] args)throws Exception {
		 BufferedInputStream f1=new BufferedInputStream(new FileInputStream("E:\\p1.jpeg"));
		 BufferedOutputStream f2=new BufferedOutputStream(new FileOutputStream("E:\\k1.txt"));
		 int lp=0;
		 while((lp=f1.read())!=-1){
			 f2.write(lp);
			 f2.flush();
		 }
		 f1.close();
		 f2.close();
	}

}
