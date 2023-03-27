package com.kashish.tutorial.java.practise;

import java.util.Scanner;
public class PaTtErNs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
	   /*     *
		     ***
		    *****
		   ******* pattern
		 
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int o=1; o<=2*i+1; o++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
	   /* ****
		  *  *
		  ****
		  *  *
		  **** pattern
		 
		for(int i=1; i<n; i++) {
			 for(int j=1; j<n; j++) {
				   if(i%2==0 && j>1 && j<n-1) {
					   System.out.print(" ");
				   }
				   else {
					   System.out.print("*");
				   }
			   }
			   System.out.print("\n");
			
		}
		*/
	
	   /*  ****
		   *  *
		   *  *
		   **** pattern
		  
		   for(int i=1; i<n; i++) {
			   for(int j=1; j<n; j++) {
				   if(i>1 && j>1 && j<n-1 && i<n-1) {
					   System.out.print(" ");
				   }
				   else {
					   System.out.print("*");
				   }
			   }
			   System.out.print("\n");
		   }
		   */		  
		 
   /*    1    
	     12
	     123
	     1234  pattern
	  
		for(int i=1; i<n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
		*/
		
	   /* 123
		  12
		  1   pattern
		 
	for(int i=1; i<n; i++) {
		for(int j=1; j<=n-i; j++) {
			System.out.print(j);
		}
		System.out.print("\n");
	}
	
	*/
		/*  *** nxm pattern
		    ***
		    
		     int m=sc.nextInt();
		     for(int i=0; i<n; i++) {
		    	 for(int j=0; j<m; j++) {
		    		 System.out.print("*");
		    	 }
		    	 System.out.print("\n");
		     }
		    */
		   	
   /*  ****** nxn pattern
	   ******
	   ******
	   ******
	   ******
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
			System.out.print("*");
			
			}
			System.out.print("\n");
		}
*/
		sc.close();
		
		
		
	}

}
