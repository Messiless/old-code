package com.imooc;
import java.util.Scanner;
import java.util.Arrays;
public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jsm qq =new Jsm();
     Scanner input=new Scanner(System.in);
   
     System.out.println("��ӭʹ�������⳵ϵͳ:");
     System.out.println("���Ƿ�Ҫ�⳵:1�� 0��");
     	int a=input.nextInt();
     if(a==0){
    	 System.out.println("�������㣡������");
     }else if(a==1){
    		 System.out.println("���      ��������       ���                ����");
    		 System.out.println("1.  �µ�A4  500Ԫ/��     ����:4��  ");
    		 System.out.println("2.  ���Դ�6  400Ԫ/��    ����:4��  ");
    		 System.out.println("3.  Ƥ��ѩ6  450Ԫ/��    ����:4 �ػ�:2��");
    		 System.out.println("4.  ����               800Ԫ/��     ����:20��       ");
    		 System.out.println("5.  �ɻ���          400Ԫ/��     �ػ�:4��");
    		 System.out.println("6.  ��ά��          1000Ԫ/��  �ػ�:20��");
     }else{
    	 System.out.println("�������");
     }
     System.out.println("��������Ҫ������������:");
     int b =input.nextInt();
     for(int c=1;c<=b;c++){
    	 System.out.println("�������"+c+"���������");
    	 int d=input.nextInt();
    	 if(d>6||d<=0){
    		 System.out.println("���������������");
    		 break;
    	 }else{
     
     System.out.println("�����⳵����:");}
     }
     int e=input.nextInt();
     System.out.println("�����˵�:");
     System.out.println("****�����˵ĳ���:");
     
    		
	}

}
