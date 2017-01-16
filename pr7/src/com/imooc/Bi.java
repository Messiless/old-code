package com.imooc;

public class Bi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher lp=new Teacher("汪老师");
try{
		 
		lp.prc();
}
catch(NoPlanException e){
	System.out.println("换个老师");
}
		
		
		
		
		
		
	}

}
