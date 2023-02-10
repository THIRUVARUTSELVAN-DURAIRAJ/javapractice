package org.test;
public class fibanosc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);
		System.out.println("The fibanosis value is:");
		for (int i=1;i<=5;i++) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		


	}

}
