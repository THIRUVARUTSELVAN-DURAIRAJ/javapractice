package org.test;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=371;
		int i=0,j=0,a=num;
		while(a>0) {
			i=a%10;
					j=(i*i*i)+j;
			a=a/10;
			
		}
		System.out.println(j);
if(j==num) {
	System.out.println("armstrong");
	
		
}
else {
	System.out.println(" Not armstrong");
	
}
	

	}

}
