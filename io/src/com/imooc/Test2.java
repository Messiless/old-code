package com.imooc;
	import java.util.*;
public class Test2 {
public static void main(String[] args)throws Exception {
	String s="ÄãºÃ";
	byte []b1=s.getBytes("gbk");
	String s1=Arrays.toString(b1);
	//System.out.println(s1);
	String s2=new String(b1,"iso8859-1");
	System.out.println(s2);
	byte[]m1=s2.getBytes("iso8859-1");
	String v1=new String(m1,"gbk");
	System.out.println(v1);
	}
}
