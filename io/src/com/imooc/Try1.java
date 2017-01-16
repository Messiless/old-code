package com.imooc;
import java.io.*;
public class Try1 {
	/*讲一个文件切割成若干份，
	 * 把一个流分成几份输出，分别输出到不同的文件中
	 * 
	 */
public static void main(String[] args) throws IOException{
	FileInputStream k1= new FileInputStream("e:\\l1.jpeg");
	FileOutputStream k2=null;
	byte[] kk=new byte[1024*1024];
	int sd=0;
	int count=1;
	while((sd=k1.read(kk))!=-1){
		k2=new FileOutputStream("e:\\"+(count++)+".part");
		k2.write(kk,0,sd);
		k2.close();
	}
	k1.close();
}
}
