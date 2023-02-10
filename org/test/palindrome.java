package org.test;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456789;
		int i=0,j=0,a=num;
		while(a>0) {
			i=a%10;
					j=(j*10)+i;
			a=a/10;
			
		}
		System.out.println(j);
if(j==num) {
	System.out.println("palindrome");
	
		
}
else {
	System.out.println(" NotPalindrome");
	
}
	
	}

}
