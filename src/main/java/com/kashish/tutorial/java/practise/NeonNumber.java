package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner =new Scanner(System.in);
int number=scanner.nextInt();
int squareOfNumber=number*number;
int s=squareOfNumber;
System.out.println(s);
int count=0;

while(squareOfNumber!=0) {
	squareOfNumber=squareOfNumber/10;
	++count;
}
System.out.println(count);
int sum=0;
for(int i=0; i<count;i++) {
	int rem=s%10;
	sum=sum+rem;
	s=s/10;
	
}
System.out.println(sum);
if(sum==number)
	System.out.print("it is a neon number");
else
	System.out.print("it is not a neon number");
	
	}

}
