package com.imooc;

public class FuShuException extends Exception{
	private String nu;
	int k;
public FuShuException(String nu,int k){
	 super(nu);
	 this.k=k;
}
public int getValue(){
	return k;
}
}
