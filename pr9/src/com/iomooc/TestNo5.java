package com.iomooc;
import java.util.*;
import java.io.*;
import java.text.*;
public class TestNo5 {

	public static void main(String[] args) {
	 try{char[]arr=new char[4];
	 System.out.println(arr[9]);
		 
	 }
	 catch(Exception e){
		 try{ Date dskp=new Date();
		 PrintStream dl=new PrintStream("E:\\h1.txt");
		 SimpleDateFormat sa=new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
		  String cd=sa.format(dskp);
		 dl.println(cd.toString());;
		 System.setOut(dl);	 
		 }
	 catch(IOException s){
		 throw new RuntimeException("jianlishibai");
	 }
	 e.printStackTrace(System.out);
	 
	 }
	 
	}

}
