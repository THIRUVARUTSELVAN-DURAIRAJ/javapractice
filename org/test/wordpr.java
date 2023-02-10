package org.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class wordpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Java is simple and Java is easy";
String[] sp=s.split(" ");
Map<String,Integer> mp=new LinkedHashMap<>();
for(int i=0;i<sp.length;i++) {
	String c=sp[i];
	if(mp.containsKey(c)) {
		Integer count=mp.get(c);
		mp.put(c, count+1);
		
		
	}
	else {
	mp.put(c, 1);	
	}
	}
System.out.println(mp);	

	}

}
