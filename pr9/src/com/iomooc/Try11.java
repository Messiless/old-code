package com.iomooc;
import java.io.*;
public class Try11 {

	public static void main(String[] args)throws Exception {
		 FileOutputStream a1=new FileOutputStream("E:\\t1\\l1.txt");
         a1.write("sdfdfsdfsd".getBytes());
         for(int i=0;i<5;i++){
        	 a1.write(("abcdefg"+i).getBytes());
         
         }
         a1.close();
	}

}
