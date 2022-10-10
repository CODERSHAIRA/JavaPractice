package com.kashish.tutorial.java.practise;

public class ReversePatternUsingRecursion {
	
	static void pattern(int n) {
		/* pattern(n)
		 * pattern(n-1)
		 * pattern(n-2)
		 * .
		 * .
		 * pattern(1)
		 */
		if(n>0) {
	for(int i=0; i<n; i++) {

		
		
			System.out.print("*");
	}
	System.out.print("\n");
	pattern(n-1);
	
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 pattern(5);
	}

}
/* *****
   ****
   ***
   **
   *
*/