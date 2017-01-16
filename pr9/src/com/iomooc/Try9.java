package com.iomooc;
import java.io.*;
public class Try9 {

	public static void main(String[] args)throws Exception {
		 FileWriter q1 =new FileWriter("E:\\t1\\j1.txt");
		 BufferedWriter q2=new BufferedWriter(q1);	
		 q2.write("aaaaaaaaaaaa");
		 q2.flush();
		 for(int i=0;i<5;i++){
			 
		 q2.write("abcd"+i);
		 q2.newLine();
		 q2.flush();
		 }
	}

}
