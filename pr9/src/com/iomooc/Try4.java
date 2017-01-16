package com.iomooc;
import java.util.*;

public class Try4 {public static void main(String[] args) {
	

Calendar c=Calendar.getInstance();
/*c.set(2012,2,1);
c.add(Calendar.DAY_OF_MONTH,-1);
System.out.println(c.get(Calendar.DAY_OF_MONTH));*/
sop(c.get(Calendar.YEAR));
 c.add(Calendar.DAY_OF_MONTH,-1);
 sop(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE));
 
}
private static void sop(Object obj){
	System.out.println(obj);
}
}
