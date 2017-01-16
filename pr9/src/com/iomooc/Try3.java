package com.iomooc;
import java.util.*;
import java.text.*;
public class Try3 {

	public static void main(String[] args) {
		Date io=new Date();
		System.out.println(io);
	 SimpleDateFormat  as=new  SimpleDateFormat("yyyyÄê");
	 String ko=as.format(io);
	 System.out.println(ko);
	}

}
