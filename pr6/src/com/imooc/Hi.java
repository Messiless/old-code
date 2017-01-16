package com.imooc;

public class Hi {
public static void main(String[] args) {
	Lp l=new Lp();
	l.sll(new Pub());
	Car n=new Pub();
	Pub m=(Pub) n;
	m.show2();
}

}