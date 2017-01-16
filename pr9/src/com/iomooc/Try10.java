package com.iomooc;
import java.io.*;
public class Try10 {

	public static void main(String[] args) throws Exception{
	 FileReader w1=new FileReader("E:\\t1\\j1.txt");
	 BufferedReader w2=new BufferedReader(w1);
	 String r1=null;
	 while((r1=w2.readLine())!=null){
		 System.out.println(r1);
	 }
	 
	 w2.close();
	}

}
