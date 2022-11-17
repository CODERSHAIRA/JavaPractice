package com.kashish.tutorial.java.practise;

public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] arr= {{1,0,3},
                       {0,5,0},
                       {0,0,9}};
		 int count=0;
		 for(int i=0; i<arr.length; i++) {
			 for(int j=0; j<arr[i].length; j++) {
           
		     if(arr[i][j]==0)
		    	 count++;
			 }
			 
		 }
		 if(count>(4.5))
			 System.out.println("Sparse matrix");
		 else
			 System.out.println("Not a Sparse matrix"); 
		 
	}

}
