package com.imooc;

public class Jp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Jo x=new Jo();
try
{
	double a=x.show(6, -2);
System.out.println(a);
}
catch(FuShuException e){
	System.out.println(e.toString());
	System.out.println(e.getMessage());
	 System.out.println(e.getValue());
}

	}

}
