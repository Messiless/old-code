package com.imooc;
import java.util.*;
public class G4 {

	public static void main(String[] args) {
		 TreeSet<String> jd= new TreeSet<String>(new G5() );
		 jd.add("dadfdf" );
		 jd.add("dfdfdfdfdfdfdfdfd" );
		 jd.add("dfdfdf" );
		 jd.add("dfdd" );
		 Iterator<String> nn= jd.iterator();
		 while(nn.hasNext()){
			 String si=nn.next();
			 System.out.println(si);
		 }
		 System.out.println(jd);

	}

}
