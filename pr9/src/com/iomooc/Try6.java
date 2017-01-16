
package com.iomooc;
import java.io.*;
public class Try6 {
public static void main(String[] args) {
	FileWriter ji= null;
	
	try {
		ji=new FileWriter("E:\\demo.txt",true);
		ji.write("\nhenhao");
	} catch (IOException e) {
		 
		System.out.println(e.toString());
	}

finally{
	try {if(ji!=null)
		ji.close();
	} catch (IOException e) {
		 
		System.out.println(e.toString());
	}
}
	 
}
}
