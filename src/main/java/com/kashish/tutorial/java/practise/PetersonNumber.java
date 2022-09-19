
package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class PetersonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int number=scanner.nextInt();

int num=number;
int count=0;
while(number!=0) {
	int rem=number%10;
	int fact=1;
	
while(rem!=0) {
	 fact=fact*rem;
	
	--rem;
	
}
count=count+fact;

number=number/10;

}
System.out.println(count);
if(count==num)
	System.out.print("It is a peterson number");
else
	System.out.print("It is not a peterson number");
}
	
		
	}


