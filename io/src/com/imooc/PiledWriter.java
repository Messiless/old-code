package com.imooc;
import java.io.*;
public class PiledWriter implements Runnable{
private PipedOutputStream k2;
PiledWriter(PipedOutputStream k2){
	this.k2=k2;
}
	
	public void run(){
		try{
	
			k2.write("caonimade fuck".getBytes());
			k2.close();
	}
	catch(IOException e){
		throw new RuntimeException("–¥»Î ß∞‹");
	}
	
	
	
	}
}
