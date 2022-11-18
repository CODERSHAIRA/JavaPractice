package com.kashish.tutorial.java.practise;

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int[][] mat= {{1,0,0},
		                 {5,1,0},
		                 {0,0,1}};
		int count=0;
		int count1=0;
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j]==0 && i!=j)
					count++;
			    if(mat[i][j]==1 && i==j)
			    	count1++;
			}
		}
		if(count==6 && count1==3)
			System.out.println("It is an Identity matrix");
		else
			System.out.println("It is not an Identity matrix");
	}

}
