 
package com.imooc;

public class A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* A1 r=new A1();
     A2 in =new A2(r);
     A3 out =new A3(r);
     Thread t1=new Thread(in);
     Thread t2=new Thread(out);
     t1.start();
     t2.start();*/
		A1 r = new A1();

		new Thread(new A2(r)).start();
		new Thread(new A3(r)).start();
	}

}
