package com.imooc;
import java.util.Scanner;
public class Lsi {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		       Peoplecar car1=new Peoplecar("�µ�A4",500,4,0);
		       Peoplecar car2=new Peoplecar("���Դ�6",400,4,0);
		       Pickup    car3=new Pickup("Ƥ��ѩ6",450,4,2);
		       Peoplecar car4=new Peoplecar("����",800,20,0);
		       Goodscar  car5=new Goodscar("�ɻ���",400,0,4);
		       Goodscar  car6=new Goodscar("��ά��",1000,0,20);
		       Scanner input=new Scanner(System.in);
		       System.out.println("��ӭʹ�ô���⳵ϵͳ�����Ƿ�Ҫ�⳵��1�� 0��");
		       int choose=input.nextInt();//����1����0ѡ��
		       if(choose==1){
		     System.out.println("�����⳵���ͼ����Ŀ��");
		     System.out.println("���\t��������\t���\t\t����");
		     System.out.println(1+"\t"+car1.getCarName()+"\t"+car1.getPrice()+"Ԫ/��"+"\t"+car1.getBusLoad()+"��"+"\t"+car1.getCarGo()+"��");
		     System.out.println(2+"\t"+car2.getCarName()+"\t"+car2.getPrice()+"Ԫ/��"+"\t"+car2.getBusLoad()+"��"+"\t"+car2.getCarGo()+"��");
		     System.out.println(3+"\t"+car3.getCarName()+"\t"+car3.getPrice()+"Ԫ/��"+"\t"+car3.getBusLoad()+"��"+"\t"+car3.getCarGo()+"��");
		     System.out.println(4+"\t"+car4.getCarName()+"\t"+car4.getPrice()+"Ԫ/��"+"\t"+car4.getBusLoad()+"��"+"\t"+car4.getCarGo()+"��");
		     System.out.println(5+"\t"+car5.getCarName()+"\t"+car5.getPrice()+"Ԫ/��"+"\t"+car5.getBusLoad()+"��"+"\t"+car5.getCarGo()+"��");
		     System.out.println(6+"\t"+car6.getCarName()+"\t"+car6.getPrice()+"Ԫ/��"+"\t"+car6.getBusLoad()+"��"+"\t"+car6.getCarGo()+"��");
		         System.out.println("��������Ҫ�⳵��������");
		         int score=input.nextInt();//����Ҫ���õ�������Ϣ
		         String nsum1="";//��ʼ������
		         String nsum2="";//��ʼ������ 
		         String nsum3="";//��ʼ������
		         String nsum4="";//��ʼ������
		         String nsum5="";//��ʼ������
		         String nsum6="";//��ʼ������
		         int psum=0;//��ʼ������
		         double hsum=0;//��ʼ������
		         double jsum=0;//��ʼ������
		         for(int i=1;i<=score;i++){
		        //ͨ������������Ϣscore����ѭ�������ֵ
		        System.out.println("�������"+i+"���������");
		        int a=input.nextInt();//ͨ������ѡ�����ֵ�����ƥ������
		        if(a>=1&&a<=6){
		              if(a==1){//����ֵ����1ʱִ���������
		           	  nsum1=car1.getCarName();
		           	  jsum+=car1.getPrice();
		                  psum+=car1.getBusLoad();
		              }
		              if(a==2){//����ֵ����2ʱִ���������
		           	  nsum2=car2.getCarName();
		           	  jsum+=car2.getPrice();
		                  psum+=car2.getBusLoad();
		              }
		              if(a==3){//����ֵ����3ʱִ���������
		           	  nsum3=car3.getCarName();
		           	  jsum+=car3.getPrice();
		                  psum+=car3.getBusLoad();
		                  hsum+=car3.getCarGo();
		              }
		              if(a==4){//����ֵ����4ʱִ���������
		           	  nsum4=car4.getCarName();
		           	  jsum+=car4.getPrice();
		                  psum+=car4.getBusLoad();
		              }
		              if(a==5){//����ֵ����5ʱִ���������
		           	  nsum5=car5.getCarName();
		           	  jsum+=car5.getPrice();
		                  hsum+=car5.getCarGo();
		              }
		              if(a==6){//����ֵ����6ʱִ���������
		           	  nsum6=car6.getCarName();
		                  jsum+=car6.getPrice();
		                  hsum+=car6.getCarGo();
		              }
		        }else{
		        System.out.println("����ֵ�д���");
		        System.exit(0);//�˳����г���
		        }
		              }
		         System.out.println("�������⳵������");
		         int b=input.nextInt();//������������ֵ��b
		         System.out.println("�����˵���");
		         System.out.println("***�����˵ĳ��У�");
		         //�ڴ����ֻҪִ�й����ٴθ�ֵ�����˳�������
		         System.out.println(nsum1+"\t"+nsum2+"\t"+nsum3+"\t"+nsum4);
		         System.out.println("�����ˣ�"+psum+"��");
		         System.out.println("***�ػ��ĳ��У�");
		         //�ڴ����ֻҪִ�й����ٴθ�ֵ���ػ���������
		         System.out.println(nsum3+"\t"+nsum5+"\t"+nsum6);
		         //��Ϊÿ�ζ�����ӣ��������ѭ�������ľ�������
		         System.out.println("���ػ���"+hsum+"��");
		         jsum=jsum*b;//��Ϊ�۸�ÿ��ѭ��û�����㣬����һֱ���һ���ٴ˴�������������
		         System.out.println("***�⳵�ܼ۸�"+jsum+"Ԫ");
		         }
		         if(choose==0){
		      System.out.println("�����˳�ϵͳ����ӭ�´�������");
		       }else{
		      System.out.println("�������ֵ����");  	  
		       }
		}
}
