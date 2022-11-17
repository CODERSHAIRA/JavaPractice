package com.kashish.tutorial.java.practise;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[][] arr= {{1,2,3},
                 {4,5,6},
                 {7,8,9}};
   array(arr);
	}
	
   public static void array(int[][] arr) {  
	   int n1= arr[1][0];
	   int n2= arr[2][0];
	   int n3= arr[2][1];
   for(int i=0; i<arr.length; i++) {
	   for(int j=0; j<arr[i].length; j++) {
		
		   arr[j][i]=arr[i][j];
   }
	   
    }
   arr[0][1] = n1;
    arr[0][2]= n2;
    arr[1][2]= n3;
   for(int i=0; i<arr.length; i++) {
	   for(int j=0; j<arr[i].length; j++) {
			
	   System.out.print(arr[i][j]);
	   }
	   System.out.print("\n");
   }
    }
	}


