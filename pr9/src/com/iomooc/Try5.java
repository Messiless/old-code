package com.iomooc;
import java.util.*;
public class Try5 {

	public static void main(String[] args) {
		/*for(int i=0;i<10;i++){
	  int ji=(int)(Math.random()*10+1);
	  sop(ji);}*/
		Random r=new Random();
		int po=r.nextInt(10);
		sop(po);
	}
	private static void sop(Object obj){
		System.out.println(obj);
	}
}
