
package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class CoderKashish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0;
int n2=1;

Scanner scanner =new Scanner(System.in);
int n=scanner.nextInt();
System.out.print(n1+" "+n2);
for(int i=0; i<n; i++) {
	int n3=n1+n2;
	n1=n2;
	n2=n3;
	System.out.print(" "+n3);
	
	
}


	}

}
