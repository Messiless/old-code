package com.imooc;
import java.io.*;
import java.util.*;
public class Test3 {
	 
	/*
	�����ѧ����ÿ��ѧ����3�ſεĳɼ���
	�Ӽ��������������ݣ��������������ſγɼ�����
	����ĸ�ʽ���磺zhagnsan��30��40��60������ܳɼ���
	����ѧ������Ϣ�ͼ�������ܷ����ߵ�˳�����ڴ����ļ�"stud.txt"�С�

	1������ѧ������
	2������һ���ɲ���ѧ������Ĺ����ࡣ

	˼�룺
	1��ͨ����ȡ����¼��һ�����ݣ����������е���Ϣȡ����װ��ѧ������
	2����Ϊѧ���кܶ࣬��ô����Ҫ�洢��ʹ�õ����ϡ���ΪҪ��ѧ�����ܷ�����
		���Կ���ʹ��TreeSet��
	3�������ϵ���Ϣд�뵽һ���ļ��С�


	*/
	public static void main(String[] args)throws IOException {
	 BufferedReader a1=new BufferedReader(new InputStreamReader(System.in));
	 Set<Test3Student> mlgb=new TreeSet<Test3Student>();
	 String b1=null;
	 while(((b1=a1.readLine())!=null))
			 {
		 if("over".equals(b1))
			 break;
		 String[]arr=b1.split(",");
		 Test3Student c1=new Test3Student(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
		 mlgb.add(c1);
			 }	 
 
		 BufferedWriter c2=new BufferedWriter(new FileWriter("e:\\gg.txt"));
		 for(Test3Student xx:mlgb){
			 c2.write(xx.toString());
			 c2.write(xx.getSum());
			 c2.newLine();
			 c2.flush();
			 System.out.println(xx);
		 }
		 a1.close();
	 c2.close();
			 
	}

}
