package com.iomooc;
import java.io.*;
public class Test5next {

	public static void main(String[] args)throws Exception {
	   
        BufferedReader ps=new BufferedReader(new InputStreamReader(new FileInputStream("E:\\t1\\j1.txt")));
        
        BufferedWriter we=new BufferedWriter(new OutputStreamWriter(System.out));
        String ni=null;
        
        while((ni=ps.readLine())!=null){
        	if("over".equals(ni))
        		break;
        	 we.write(ni.toUpperCase());
        	 we.newLine();
        	 we.flush();
        }
ps.close();
	}

}
