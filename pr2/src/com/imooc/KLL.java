package com.imooc;

public class KLL {
	private String name = "爱慕课";
	public void show() {
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
		MInner hi =new MInner();
int newScore=hi.getScore();
        
		System.out.println("姓名：" + name + "\n加分后的成绩：" + newScore);
	}
	public static void main(String[] args) {
		KLL mo=new KLL();
		mo.show();
	}
}
