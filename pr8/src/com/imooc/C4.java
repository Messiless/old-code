package com.imooc;

public class C4 {
	public static void main(String[] args)
	{
		String s1 = "abcwerthelloyuiodef";
		String s2 = "cvhellobnm";
	System.out.println(panDuan(s1,s2));
	}	
	public static String panDuan(String s1,String s2)
	{
			String s3 = "";
			int chang = s2.length();
			while (chang > 0)
			{
				for (int x = 0;x <s2.length() - chang + 1 ;x++)
				{	
					 s3 = s2.substring(x,chang+x);
					 
					if(s1.contains(s3))
					{
						return s3;
					}
						
				}
				chang --;

			}
			return "";	
	}
}


