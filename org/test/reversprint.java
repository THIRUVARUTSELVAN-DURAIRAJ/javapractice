package org.test;
public class reversprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "madam";
String rev=" ";
for (int i=s.length()-1;i>=0;i--) {
	char c=s.charAt(i);
	rev=rev + c;
}
System.out.println(rev);

	
if (s.equals(rev)) {
	System.out.println("Palindrome");
}

else {
	
	System.out.println("not palindrome");
	
}
}
}
