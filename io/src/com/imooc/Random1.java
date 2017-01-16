package com.imooc;
import java.io.*;
public class Random1 {
public static void main(String[] args)throws IOException {
	//showget();
    showname();
}
public static void showname()throws IOException{
	RandomAccessFile p1=new RandomAccessFile("e:\\haode.txt","rw");
	p1.seek(16);
	byte[]arr=new byte[4];
	p1.read(arr);
	String ko=new String(arr);
	int age=p1.readInt();
	System.out.println(ko+":"+age);
	p1.seek(32);
	p1.write("李二".getBytes());
	p1.writeInt(45);
	p1.close();
}
public static void showget () throws IOException{
	RandomAccessFile p1=new RandomAccessFile("e:\\haode.txt","rw");
	p1.write("张三".getBytes());
	p1.writeInt(23);
	p1.write("李四".getBytes());
	p1.writeInt(45);
	p1.write("王五".getBytes());
	p1.writeInt(45);
	p1.close();
}
}
