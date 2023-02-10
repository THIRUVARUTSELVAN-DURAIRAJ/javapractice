package org.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class sentenrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="Java is simple and Java is easy";
		String[] sp=s.split(" ");
		String op=" ";
		//Map<String,Integer> mp=new LinkedHashMap<>();
		for(int i=0;i<sp.length;i++) {
			String c=sp[i];
			String rev=" ";
			for(int j=c.length()-1;j>=0;j--) {
				
				rev=rev+c.charAt(j);
				
			}
				op=op+rev+" ";			
			}
		System.out.println(op);	
			}
		

			}

		

		
		
		
		
		



