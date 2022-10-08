package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class CheckSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("n: ");
int sizeOfArray=sc.nextInt();
int n=sizeOfArray;
int[] arr=new int[n];
System.out.print("elements in the array: ");
int i=0;
for( i=0; i<n; i++) {
	arr[i]=sc.nextInt();
	
}
for(i=0; i<n; i++) {
	System.out.println(arr[i]);
}
int count=0;
for( i=0; i<n-1; i++) {
	
if(arr[i]<arr[i+1]) {
	++count;
}
}
if(count==n-1) {
	System.out.println("array is sorted");
}
else
	System.out.println("array is not sorted");
	
	}

}
