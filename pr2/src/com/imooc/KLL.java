package com.imooc;

public class KLL {
	private String name = "��Ľ��";
	public void show() {
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
		MInner hi =new MInner();
int newScore=hi.getScore();
        
		System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" + newScore);
	}
	public static void main(String[] args) {
		KLL mo=new KLL();
		mo.show();
	}
}
