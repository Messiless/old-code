package com.imooc;
import java.io.*;
import java.util.*;	
public class File5 {
/*
 ˼·��
1����ָ����Ŀ¼���еݹ顣
2����ȡ�ݹ�������Ե�java�ļ���·����
3������Щ·���洢�������С�
4���������е�����д�뵽һ���ļ��С�
 */	
	public static void main(String[] args) throws IOException {
		 File c1=new File("e:\\ѧϰ\\");
		 List<File> m1=new ArrayList();
		 getkill(c1,m1);
		 File koo=new File("e:\\t1");
		 File sm=new File(koo,"fuck.txt");
		 showget(m1,sm.toString());

	}

	public static void getkill(File s1,List<File>list){
		File[]x1=s1.listFiles();
		for(File x2:x1){
			if(x2.isDirectory()){
				getkill(x2,list);
			}
			else{
				if(x2.getName().endsWith(".java"));
				list.add(x2);
			}
		
		}
	}
	public static void showget(List<File>list,String ko)throws IOException{
		BufferedWriter ad = null;
		try{
			ad=new BufferedWriter(new FileWriter(ko));
			for(File v1:list){
				String mgb=v1.getAbsolutePath();
				ad.write(mgb);
				ad.newLine();
				ad.flush();
			}
			
		}
	catch(IOException e){
		throw e;
	}
	finally{
			try{if(ad!=null)
				ad.close();
				
			}
			catch(IOException e){
				throw e;
			}
	}
	
	
	
	
	
	}
}
