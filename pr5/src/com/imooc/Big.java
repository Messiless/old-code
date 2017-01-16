package com.imooc;

public class Big {
private String name;
private int people;
private double thing;
private int money;
 Big(String name,int people,int thing,int money){
	this.name=name;
	this.people=people;
	this.thing=thing;
	this.money=money;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPeople() {
	return people;
}
public void setPeople(int people) {
	this.people = people;
}
public double getThing() {
	return thing;
}
public void setThing(double thing) {
	this.thing = thing;
}
public int getMoney() {
	return money;
}
public void setMoney(int money) {
	this.money = money;
}
}
