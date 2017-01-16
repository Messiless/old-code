package com.imooc;

public class PublicCar extends Car {
	int high=33;
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + high;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PublicCar other = (PublicCar) obj;
		if (high != other.high)
			return false;
		return true;
	}
	public void show(){
		System.out.println("汽车高度:"+high+"公共汽车名字"+name);
	}
	public PublicCar(){
		System.out.println("这尼玛b的");
	}
	
}
