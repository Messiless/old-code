 
package com.imooc;

 import java.util.*;
public class G2 {

	public static void main(String[] args) {
	 ArrayList  li=new ArrayList();
 
	 li.add(new G1("李三",23));
	 li.add(new G1("哇撒",22));
	 li.add(new G1("打的",25));
	 li.add(new G1("打的",25));
	 li.add(new G1("卡萨丁",12));
	 li.add(new G1("王五",32));
	 li=show(li);
	 Iterator it=li.iterator();
	 while(it.hasNext()){
		 G1 c=(G1) it.next();
		 
		 
	System.out.println(c.getName()+":"+c.getAge());
	 }
	 }

public  static ArrayList show(ArrayList x){
	ArrayList x1=new ArrayList();
	Iterator it= x.iterator();
	while(it.hasNext()){
		Object obj=it.next();
		if(!x1.contains(obj)){
			x1.add(obj);
		}
	}
	
	
	
	
	
	
	return x1;
		
		
		
		
		
	}

}
