package com.imooc;

public class NIke {
public static void main(String[] args) {
	/*for(int i=1;i<6;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j);
		}System.out.println();
	}*/
	show(4);
	int[] x=new int[3];
	System.out.println(x[2]);
}
	
	
	public static void show(int a){
	for(int i=1;i<=a;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j+"*"+i+"="+j*i+"\t");
		}System.out.println();
	
	
}
}
}
