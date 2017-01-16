package com.imooc;
import java.io.*;
import java.util.*;
public class Test3 {
	 
	/*
	有五个学生，每个学生有3门课的成绩，
	从键盘输入以上数据（包括姓名，三门课成绩），
	输入的格式：如：zhagnsan，30，40，60计算出总成绩，
	并把学生的信息和计算出的总分数高低顺序存放在磁盘文件"stud.txt"中。

	1，描述学生对象。
	2，定义一个可操作学生对象的工具类。

	思想：
	1，通过获取键盘录入一行数据，并将该行中的信息取出封装成学生对象。
	2，因为学生有很多，那么就需要存储，使用到集合。因为要对学生的总分排序。
		所以可以使用TreeSet。
	3，将集合的信息写入到一个文件中。


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
