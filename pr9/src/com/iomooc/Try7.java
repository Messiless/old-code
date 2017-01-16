package com.iomooc;
import java.io.*;

public class Try7 {

	public static void main(String[] args)   {
		 FileReader s= null;
		 try{
			   s=new FileReader("E:\\demo.txt");
			   char[]arr=new char[1024];
			   int t1=0;
			 while((t1=s.read(arr))!=-1){
			   System.out.print(new String(arr,0,t1));}
		 }
		 catch(IOException e){
			 System.out.println(e.toString());
		 }
		 finally{
			 try{if(s!=null)
				 s.close();
			 }
			 catch(IOException e){
				 System.out.println(e.toString());
			 }
		 }
	}

}
