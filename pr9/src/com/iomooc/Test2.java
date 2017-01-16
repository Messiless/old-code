package com.iomooc;
import java.io.*;
public class Test2 {

	public static void main(String[] args) {
	 BufferedWriter p2=null;
	 BufferedReader p1=null;
	 try{
		 p1=new BufferedReader(new FileReader("E:\\t1\\j1.txt"));
		 p2=new BufferedWriter(new FileWriter("E:\\t1\\j2.txt"));
		 String d1=null;
		 while((d1=p1.readLine())!=null){
			  p2.write(d1);
			  p2.newLine();
			  p2.flush();
		 }
	 }
catch(IOException e){
	throw new RuntimeException("∂¡–¥ ß∞‹");
}
	 finally{try{
		 if(p1!=null){
			 p1.close();
		 }
	 }
		 catch(IOException e){
			 System.out.println("∂¡»° ß∞‹");
		 }
	 try{
		 if(p2!=null){
			 p2.close();
		 }
	 }
		 catch(IOException e){
			 System.out.println("–¥»Î ß∞‹");
		 }
	 }
	 
	}

}
