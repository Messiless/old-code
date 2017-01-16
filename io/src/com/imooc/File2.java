package com.imooc;
import java.io.*;
public class File2 {
//读取文件，输出我们想要的文件
	public static void main(String[] args) {
		 File[]ko=File.listRoots();
		 for(File sa:ko){
//			 System.out.println(sa);
		 }
File a1=new File("f:\\music");
File[]s1=a1.listFiles(new FilenameFilter(){
	 public boolean accept(File a1, String s2){
		return s2.endsWith(".mp3");
	}
});
for(File s2:s1){
	System.out.println(s2);
}
	}

}
