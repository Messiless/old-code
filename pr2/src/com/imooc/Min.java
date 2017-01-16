package com.imooc;

public class Min {
	public static void main(String[] args) {
		PublicCar ufo =new PublicCar();
		ufo.high=5;
		PublicCar ufo2=new PublicCar();
		ufo2.high=5;
		System.out.println(ufo);
		if(ufo.equals(ufo2)){
			System.out.println("相同");
		}else{
			System.out.println("不同");
		}
			
/*PublicCar sm=new PublicCar();
sm.name="三菱";
sm.high=6;
sm.show();*/
}
}
