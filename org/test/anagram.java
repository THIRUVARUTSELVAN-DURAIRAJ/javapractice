package org.test;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int n=111;n<=999;n++) {
			int i=0,j=0,a=n;
			while(a>0) {
				i=a%10;
						j=(i*i*i)+j;
				a=a/10;
				
			}
				//System.out.println(j);
			if(j==n) {
		System.out.println("Armstrong Number:    "+j);
	
			
	}
else {
		//System.out.println("Not armstrong:    "  +n);
		
	}
		
	}
					}
		
	}
	



	