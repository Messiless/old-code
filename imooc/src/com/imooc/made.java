package com.imooc;
import java.util.Scanner;
public class made {
  public static void main(String[] args) {
	 Scanner input=new Scanner(System.in);
	int classNum=3;
	int stuNum=4;
	double sum=0;
	double avg=0;
	for(int i=1;i<=classNum;i++){
		sum=0;
		System.out.println("�������"+i+"���༶�ĳɼ�");
		for(int j=1;j<=stuNum;j++){
			System.out.println("��"+j+"��ͬѧ�ĳɼ�");
			double score=input.nextDouble();
			sum+=score;
		
		}avg=sum/stuNum;
		System.out.println("ƽ����Ϊ"+avg);
	}
			
}
}
