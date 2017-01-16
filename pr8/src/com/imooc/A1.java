 
 package com.imooc;
 import java.util.concurrent.locks.*;
 class A1 {
 
  private String name;
  private String sex;
  private Lock lock = new ReentrantLock();;
  private Condition x1=lock.newCondition();
  private Condition x2=lock.newCondition();
 private boolean flag= false;
  
  public  void set(String name,String sex) throws InterruptedException{
lock.lock();try{
	  while(flag)
	 x1.await();
	  this.name=name;
	  this.sex=sex;
	  flag=true;
	  x2.signal();
}
	finally{  lock.unlock();}
  }
  public   void show()throws InterruptedException{
	  lock.lock();try{
	  while(!flag)
		    x2.await();
		   
		  System.out.println(name+"......."+sex);
		  flag=false;
		  x1.signal();
	  }
 finally {
	  lock.unlock();}
	  		   
   
	  }
  }
  
  
  
  
  
  
 