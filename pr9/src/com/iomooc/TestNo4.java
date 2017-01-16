package com.iomooc;
import java.io.*;
public class TestNo4 {

	public static void main(String[] args)throws Exception {
	 FileReader f1=new FileReader("E:\\demo.txt");
 OutputStreamWriter f2=new OutputStreamWriter(System.out);
 int i=0;
 while((i=f1.read())!=-1){
	 f2.write(i);
	 f2.flush();
 }
 f1.close();
 f2.close();
	}

}
