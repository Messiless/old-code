package com.imooc;
import java.io.*;
public class File4 {
 //µÝ¹é£¬Ò»Ò»É¾³ý
	public static void main(String[] args) {
		File ab=new File("E:\\mm");
		  show(ab);
	}
public static void show(File dr){
	File[]arr=dr.listFiles();
	for(int i=0;i<arr.length;i++){
		if(arr[i].isDirectory()){
			show(arr[i]);
		}
		else{
			arr[i].delete();
		}
	}
	dr.delete();
}
}
