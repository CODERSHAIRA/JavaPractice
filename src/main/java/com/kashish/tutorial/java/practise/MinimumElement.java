package com.kashish.tutorial.java.practise;
import java.util.Scanner;
import java.util.Scanner;

public class MinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[7];
		for(int i=0; i<7; i++) {
			arr[i]=sc.nextInt();
		}
int min=arr[0];
for(int e: arr) {
	if(e<min)
		min=e;
}
	System.out.println("Maximum element is: "+min);

	}

}
