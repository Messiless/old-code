package com.iomooc;
import java.io.*;
public class Test5 {

	public static void main(String[] args)throws Exception {
		InputStream ko=System.in;
		StringBuilder k1=new StringBuilder();
		int w=0;
		while((w=ko.read())!=-1){
			if(w=='\r')
				continue;
			if(w=='\n'){
				String lp=k1.toString();
				if("over".equals(lp))
			break;
				System.out.println(lp);
				k1.delete(0, k1.length());
			}
			else{
				k1.append((char)w);
			}
		}
	}

}
