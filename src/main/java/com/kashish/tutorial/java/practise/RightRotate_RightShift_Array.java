package com.kashish.tutorial.java.practise;

public class RightRotate_RightShift_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr = {3,5,1,9};
    int n=arr[arr.length-1];
  for(int i=arr.length-1; i>=1; i--) {
	  arr[i]=arr[i-1];

  }
  arr[0]=n;
  System.out.print("New array after right rotate: "+"{");
  int count=arr.length-1;
 for(int i=0; i<arr.length; i++) {
	 System.out.print(arr[i]);
	
	 if(count>=1) {
	 System.out.print(",");
	 count--;
 }
 }
 System.out.print("}");
	}

}