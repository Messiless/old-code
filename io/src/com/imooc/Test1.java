package com.imooc;
import java.io.*;
import java.util.*;
public class Test1 {
/*�������ļ������һ���ļ����棻
�������ļ���Ϊ���������������ϲ����ٴ���ȥ
	
	*/
	public static void main(String[] args) throws IOException{
	 Vector<FileInputStream> n1=new Vector<FileInputStream>();
	 n1.add(new FileInputStream("E:\\m1.txt"));
	 n1.add(new FileInputStream("E:\\m2.txt"));
	 n1.add(new FileInputStream("E:\\m3.txt"));
Enumeration<FileInputStream> xc=n1.elements();
SequenceInputStream ll=new SequenceInputStream(xc);
FileOutputStream ew=new FileOutputStream("E:\\m4.txt");
byte[]arr=new byte[1024];
int p=0;
while((p=ll.read(arr))!=-1){
	ew.write(arr,0,p);
}
ll.close();
ew.close();
	}

}
