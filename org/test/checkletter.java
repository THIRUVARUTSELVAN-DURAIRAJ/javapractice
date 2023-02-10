package org.test;
public class checkletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="SElVAn12PL893@";
int upper=0,lower=0,digit=0,sp=0;
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(Character.isUpperCase(c)) {
		upper++;
	}
	else if(Character.isLowerCase(c)) {
		lower++;
	}
	else if(Character.isDigit(c)) {
		digit++;
	}
	else {
		sp++;
	}
			
}
System.out.println("lower count"+lower);
System.out.println("upper count"+upper);
System.out.println("digit"+digit);
System.out.println("special char"+sp);
	}

}
