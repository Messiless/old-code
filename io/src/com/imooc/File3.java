package com.imooc;
import java.io.*;

public class File3 {

	public static void main(String[] args) {
	File a1=new File("e:\\ѧϰ\\");
	showfile(a1,0);

	}
	public static String gtell(int level){
		StringBuilder sb=new StringBuilder();
		for(int x=0;x<level;x++){
			sb.append("  ");
		}
		return sb.toString();
	}
public static void showfile(File dir,int level){
	System.out.println(gtell(level)+dir.getName());
	level++;
	File[]a2=dir.listFiles();
	for(File s1:a2){
		if(s1.isDirectory()){
			showfile(s1,level);
		}
		else
		System.out.println(s1);
	}
}
}
