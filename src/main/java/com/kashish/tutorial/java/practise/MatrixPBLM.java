package com.kashish.tutorial.java.practise;

public class MatrixPBLM {

	public static void main(String[] args) {

		int[][] mat= {{1,3,2,0},
		             {3,9,5,2},
		             {1,4,2,1},
		             {0,2,1,3}};
		int w=1;
		int[] row= new int[mat.length];
		int[] col= new int[mat[0].length];
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j]==0) {
					row[w-1]=i;
					col[w-1]=j;
				}
			}
			w++;
		}
		int i=0;
		while(i<row.length) {
			for(int j=0; j<col.length; j++) {
				mat[row[i]][j]=0;
			}
			i++;
		}
		int j=0;
		while(j<col.length) {
			for(int x=0; x<col.length; x++) {
				mat[x][col[j]]=0;
			}
			j++;
		}
		for(int k=0; k<mat.length; k++) {
			for(int k1=0; k1<mat[k].length; k1++) {
				System.out.print(mat[k][k1]+ " ");
			}
			System.out.println();
		}
		
	}

}
