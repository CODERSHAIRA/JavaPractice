package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class MaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[7];
		for(int i=0; i<7; i++) {
			arr[i]=sc.nextInt();
		}
int max=0;
for(int e: arr) {
	if(e>max)
		max=e;
}
	System.out.println("Maximum element is: "+max);

}
}