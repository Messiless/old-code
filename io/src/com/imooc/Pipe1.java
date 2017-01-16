package com.imooc;
import java.io.*;
public class Pipe1 {
//管道流，多线程，一边写入，一边输出
	public static void main(String[] args)throws Exception{
	 PipedInputStream l1=new PipedInputStream();
	 PipedOutputStream l2=new PipedOutputStream();
	  l2.connect(l1);
    PileRead m1=new PileRead(l1);
    PiledWriter m2=new PiledWriter(l2);
   
    Thread n1=new Thread(m1);
    Thread n2=new Thread(m2);
   n1.start();
   n2.start();
	}

}
