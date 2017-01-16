package com.imooc;

public class C1 {
public static String getnum(String q,String w){
	for(int i=0;i<w.length();i++){
		for(int j=0,z=w.length()-i;z!=w.length()+1;j++,z++){
			String ll=w.substring(j, z);
			if(q.contains(ll)){
				 
				return ll;
			}
		}
	}
	return null;
}
}
