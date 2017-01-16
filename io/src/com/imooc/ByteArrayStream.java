package com.imooc;
import java.io.*;
public class ByteArrayStream {
 public static void main(String[] args) {
	ByteArrayInputStream a1=new ByteArrayInputStream("sdfsd".getBytes());
	ByteArrayOutputStream a2=new ByteArrayOutputStream();
	int x=0;
	while((x=a1.read())!=-1){
		a2.write(x);
	}
	System.out.println(a2.toString());
}
}
