package com.imooc;

public class Nike {
	private static int score=84;
	private int age=34;
	public static class Like{
		int score=23;
		public void show(){
			System.out.println("访问外部类中的score:"+Nike.score);
			System.out.println("访问内部类中的score:"+score);
	        System.out.println(new Nike().score);	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Like i =new Like();
        i.show();
	}

}
