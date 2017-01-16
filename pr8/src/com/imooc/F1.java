package com.imooc;
import java.util.*;

public class F1 {
private LinkedList link;
F1(){
	link=new LinkedList();
}
public void add(Object obj){
	link.add(obj);
}
public Object remove(){
	return link.removeLast();
}
boolean emp(){
	return link.isEmpty();
}










}
