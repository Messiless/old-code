package com.imooc;

public class Jo {
 int a ;
 int b;
 int show(int a ,int b)throws FuShuException
 {
	this.a=a;
	this.b=b;
    if(b<0) 
   throw  new FuShuException("除数为负数啊",b);
    return a/b;	
 }
}
