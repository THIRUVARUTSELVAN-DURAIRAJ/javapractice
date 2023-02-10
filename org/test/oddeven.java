package org.test;
public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddcount=0,evencount=0;
		
		for (int i=1;i<=10;i++) {
			if(i%2==0) {
				evencount=evencount+i;
				System.out.println("even number:"+i);
			}
			
			else {
				oddcount=oddcount+i;
				System.out.println("odd number:"+ i);
			}
		}
		System.out.println("even count:"+evencount);
		System.out.println("odd count:"+oddcount);
		
			
		}
		

	
	}

