package com.imooc;
import java.util.Scanner;
public class Last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������������
    Big f1=new Big("�µ�A4",4,0,500);
    Big f2=new Big("���Դ�6",4,0,400);
    Big f3=new Big("Ƥ��ѩ",4,2,450);
    Big f4=new Big("����",20,0,800);
    Big f5=new Big("�ɻ���",0,4,400);
    Big f6=new Big("��ά��",0,20,1000);
    Scanner input=new Scanner(System.in);
    
    System.out.println("��ӭʹ�������⳵ϵͳ:");
    System.out.println("���Ƿ�Ҫ�⳵:1�� 0��");
    	int a=input.nextInt();
    if(a==0){
   	 System.out.println("�������㣡������");
    }
   	 else if(a==1){
   		System.out.println("�����⳵���ͼ����Ŀ��");
	     System.out.println("���\t��������\t���\t\t����");
	     System.out.println(1+"\t"+f1.getName()+"\t"+f1.getMoney()+"Ԫ/��"+"\t"+f1.getPeople()+"��"+"\t"+f1.getThing()+"��");
	     System.out.println(1+"\t"+f2.getName()+"\t"+f2.getMoney()+"Ԫ/��"+"\t"+f2.getPeople()+"��"+"\t"+f2.getThing()+"��");
	     System.out.println(1+"\t"+f3.getName()+"\t"+f3.getMoney()+"Ԫ/��"+"\t"+f3.getPeople()+"��"+"\t"+f3.getThing()+"��");
	     System.out.println(1+"\t"+f4.getName()+"\t"+f4.getMoney()+"Ԫ/��"+"\t"+f4.getPeople()+"��"+"\t"+f4.getThing()+"��");
	     System.out.println(1+"\t"+f5.getName()+"\t"+f5.getMoney()+"Ԫ/��"+"\t"+f5.getPeople()+"��"+"\t"+f5.getThing()+"��");
	     System.out.println(1+"\t"+f6.getName()+"\t"+f6.getMoney()+"Ԫ/��"+"\t"+f6.getPeople()+"��"+"\t"+f6.getThing()+"��");
	     System.out.println("��������Ҫ�⳵��������");
	     int score=input.nextInt();
	     String nub1="";
	     String nub2="";
	     String nub3="";
	     String nub4="";
	     String nub5="";
	     String nub6="";
	     int pr=0;
	     int peo=0;
	     int thi=0;
	     for(int o=1;o<=score;o++){
	    	 System.out.println("�������"+o+"�������");
	     
	     int ss=input.nextInt();
	     if(ss>=1&&ss<=6){
	     if(ss==1){nub1=f1.getName();
	     pr+=f1.getMoney();
	     peo+=f1.getPeople();
	     thi+=f1.getThing();
	     }
	     
	     if(ss==2){nub2=f2.getName();
	     pr+=f2.getMoney();
	     peo+=f2.getPeople();
	     thi+=f2.getThing();
	     }
	     if(ss==3){nub3=f3.getName();
	     pr+=f3.getMoney();
	     peo+=f3.getPeople();
	     thi+=f3.getThing(); 
	     }
	     if(ss==4){nub4=f4.getName();
	     pr+=f4.getMoney();
	     peo+=f4.getPeople();
	     thi+=f4.getThing(); 
	     
	     if(ss==5){nub5=f5.getName();
	     pr+=f5.getMoney();
	     peo+=f5.getPeople();
	     thi+=f5.getThing();
	     }
	     if(ss==6){nub6=f6.getName();
	     pr+=f6.getMoney();
	     peo+=f6.getPeople();
	     thi+=f6.getThing();
	     }
	     }
	      
	     } else {
	    	 System.out.println("������������");
	    	 }
	     }
	     
    System.out.println("�������⳵������");
    int jk=input.nextInt();
    System.out.println("�����˵���");
    System.out.println("***�����˵ĳ��У�");
   System.out.print( nub1+"\t"+nub2+"\t"+nub3+"\t"+nub4+"\t");
   System.out.println("�����ˣ�"+peo+"��");
   System.out.println("***�ػ��ĳ��У�");
   System.out.print(nub3+"\t"+nub5+"\t"+nub6+"\t");
   System.out.println("���ػ���"+thi+"��");
   pr=pr*jk;
   System.out.println("***�⳵�ܼ۸�"+pr+"Ԫ");
    
     
   
   
   
   
   	 }
   	 else{
   		 System.out.println("���������");
   	 }
}
   
}
    
    
    
	


