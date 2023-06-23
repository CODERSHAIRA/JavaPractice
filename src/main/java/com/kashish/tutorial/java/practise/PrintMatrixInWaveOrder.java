package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class PrintMatrixInWaveOrder {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int[][] mat= new int[a][b];
		for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		for(int c=0; c<a; c++) {
			for(int d=0; d<b; d++) {
				System.out.print(mat[c][d] +" ");
			}
			System.out.print("\n");
		}
		for(int q=0; q<b; q++) {
			for(int p=0; p<a; p++) {
				if(q%2==0) {
				System.out.print(mat[p][q] +" ");
			}
				else {
					System.out.print(mat[a-p-1][q] +" ");
				}
				
			}
			System.out.print("\n");
		}
			

	}
	
}
