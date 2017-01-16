package com.imooc;

public class Teacher {
	String mes;
Computer n=new Computer();
public Teacher(String mes){
	this.mes=mes;
	}
public void prc() throws NoPlanException 
{
	try{
	n.run();

}
	catch(LanpinException e){
		n.chongqi();
		
	}
	catch(MaoyanException e){
		throw new NoPlanException("无法继续上课");
	}
	System.out.println("教书");
}
}
