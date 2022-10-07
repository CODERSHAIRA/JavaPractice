package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class CheckArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[5];
		int i=0;
		for( i=0; i<5; i++) {
			  arr[i]=scanner.nextInt();
			  System.out.println(arr[i]);
		}
if(arr[0]==n || arr[1]==n || arr[2]==n || arr[3]==n || arr[4]==n) {
	System.out.print("element present in an array");
}
else
	System.out.print("element not present in an array");
	}

}
