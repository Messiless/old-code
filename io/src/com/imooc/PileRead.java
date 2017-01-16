package com.imooc;
 import java.io.*;
public class PileRead implements Runnable{
private PipedInputStream sk;
PileRead(PipedInputStream sk){
	this.sk=sk;
}
	public void run() {
	try{ byte[] k1=new byte[1024];
	 int i=sk.read(k1);
	 String lp=new String(k1,0,i);
	 Thread.sleep(6000);
	System.out.println(lp);
	 sk.close();
	}
	catch(Exception e){
		throw new RuntimeException("∂¡»° ß∞‹");
	}
	}

}
