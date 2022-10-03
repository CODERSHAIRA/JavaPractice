package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Let the number is: ");
int n=scanner.nextInt();
int n1=n;
int n2=n1;
int count=0;
while(n!=0) {
	
	n=n/10;
	++count;
	
}
System.out.println("Number of digits in this number: "+count);
int sum=0;
for(int i=0; i<count; i++) {
	int rem=n1%10;
	sum=sum+rem;
	n1=n1/10;
}
System.out.println("sum: "+sum);
int product=1;
for(int j=0; j<count; j++) {
	int r=n2%10;
	product=product*r;
	n2=n2/10;
}
System.out.println("product: "+product);
if(sum==product)
	System.out.println("it is a spy number");
else
	System.out.println("it is not a spy number");
	}

}
