package com.iomooc;
import java.util.*;
public class Try2 {

	public static void main(String[] args) {
		
Properties b1=System.getProperties();
for(Object obj:b1.keySet()){
	String pro=(String)b1.get(obj);
	System.out.println( pro+"...."+pro);
	
}

	}

}
