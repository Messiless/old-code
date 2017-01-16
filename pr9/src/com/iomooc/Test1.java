package com.iomooc;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
      twosave(2.3333);

	}
private static void twosave(double a){
	
	double b=a*100;
	double c=Math.rint(b);
	double d= c/100;
	System.out.println(d);
}
}
