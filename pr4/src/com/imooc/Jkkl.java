package com.imooc;

public class Jkkl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IplayGame jj=new Psp();
IplayGame ll=new Cellphone();
jj.playgame();
ll.playgame();
 IplayGame uu=new IplayGame(){

	@Override
	public void playgame() {
		// TODO Auto-generated method stub
		System.out.println("��ͼ�����������������");
	}
	 
 };
 uu.playgame();
	}

}
