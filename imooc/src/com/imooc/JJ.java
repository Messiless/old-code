package com.imooc;
import java.util.Arrays;
public class JJ {
public static void main(String[] args) {
	int[]scores={89,34,64,91,39,52,93};
	System.out.println("考试成绩前三名为:");
	JJ hello=new JJ();
	hello.top3(scores);
}
public void top3(int[]scores){
	Arrays.sort(scores);
	int num=0;
	for(int i=scores.length-1;i>=0;i--){
		if(scores[i]<0||scores[i]>100){
			continue;
		}num++;
		if(num>3){
			break;
		}System.out.println(scores[i]);
	}
			
}
}
