package com.kashish.tutorial.java.practise;

public class SumOfRowsAndColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int[][] mArr= {{1,2,3},
				       {4,5,6}, 
				       {7,8,9}};
		for(int i=0; i<mArr.length; i++) {
			int sum1=0;
			for(int j=0; j<mArr[i].length; j++) {
				sum1=sum1+mArr[i][j];
				
			}
			if(i==0)
				System.out.print("Row1 sum is: ");
			else if(i==1)
				System.out.print("Row2 sum is: ");
			else
				System.out.print("Row3 sum is: ");
			
			System.out.println(sum1);
			
		}
for(int j=0; j<mArr.length; j++) {
	int sum2=0;
	for(int i=0; i<mArr[j].length; i++) {
		sum2=sum2+mArr[i][j];
		
	}
	if(j==0)
		System.out.print("Col1 sum is: ");
	else if(j==1)
		System.out.print("Col2 sum is: ");
	else
		System.out.print("Col3 sum is: ");
	
	System.out.println(sum2);
	
}

	}

}
