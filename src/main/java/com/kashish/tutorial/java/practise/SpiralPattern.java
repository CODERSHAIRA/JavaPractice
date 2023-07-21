//package com.kashish.tutorial.java.practise;
//import java.util.*;
//public class SpiralPattern {
//
//	public static void main(String[] args) {
//
//		Scanner sc =new Scanner(System.in);
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		int[][] mat =new int[a][b];
//		for(int i=0; i<a; i++) {
//			for(int j=0; j<b; j++) {
//				mat[i][j]=0;
//			}
//			
//		}
//		int i=0;
//		int j=0;
//		int x=1;
//		while(mat[i][j]==0) {
//			if(i==j && j<b-1 && mat[i][j+1]==0 && mat[i][j-1]!=0 ) {
//				while(j<b && mat[i][j]==0 ) {
//					mat[i][j]=x;
//					x++;
//					j++;
//				}
//			}
//			 if(i<j && i<a-1 && mat[i+1][j]==0 && mat[i-1][j]!=0) {
//				 i++;
//				 while(i<a && mat[i][j]==0 ) {
//					mat[i][j]=x;
//					x++;
//					i++;
//				}
//			 }	
//			 if(i==j && j>0 && mat[i][j-1]==0 && mat[i][j+1]!=0 ) {
//				 j--;
//				 while(j>=0 && mat[i][j - 1] == 0 && mat[i][j]==0) {
//					mat[i][j]=x;
//					x++;
//					j--;
//				}
//			 }
//			 if(i>j && i>0 && mat[i-1][j]==0 && mat[i+1][j]!=0) {
//				 i--;
//				 while(i>=0 && mat[i][j] == 0 ) {
//					mat[i][j]=x;
//					x++;
//					i--;
//				}
//			}
//		}
//		for(int w=0; w<a; w++) {
//			for(int y=0; y<b; y++) {
//				System.out.print(mat[w][y] +" ");
//			}
//			System.out.print("\n");
//		}
//	}
//	}
package com.kashish.tutorial.java.practise;
//import java.util.Scanner;
//
//public class SpiralPattern {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int[][] mat = new int[a][b];
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                mat[i][j] = 0;
//            }
//        }
//
//        int i = 0;
//        int j = 0;
//        int x = 1;
//        while (mat[i][j] == 0) {
//            if (i == j && j < b - 1 && mat[i][j + 1] == 0 && j>=0) {
//                while (j < b && mat[i][j] == 0) {
//                    mat[i][j] = x;
//                    x++;
//                    j++;
//                }
//            }
//            if (i < j && i < a - 1 && mat[i + 1][j] == 0 && mat[i - 1][j] != 0) {
//                i++;
//                while (i < a && mat[i][j] == 0) {
//                    mat[i][j] = x;
//                    x++;
//                    i++;
//                }
//            }
//            if (i == j && j > 0 && mat[i][j - 1] == 0 && mat[i][j + 1] != 0) {
//                j--;
//                while (j >= 0 && mat[i][j - 1] == 0 && mat[i][j] == 0) {
//                    mat[i][j] = x;
//                    x++;
//                    j--;
//                }
//            }
//            if (i > j && i > 0 && mat[i - 1][j] == 0 && mat[i + 1][j] != 0) {
//                i--;
//                while (i >= 0 && mat[i][j] == 0) {
//                    mat[i][j] = x;
//                    x++;
//                    i--;
//                }
//            }
//        }
//
//        for (int w = 0; w < a; w++) {
//            for (int y = 0; y < b; y++) {
//                System.out.print(mat[w][y] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] mat = new int[a][b];

        int value = 1;
        int topRow = 0, bottomRow = a - 1, leftCol = 0, rightCol = b - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            for (int i = leftCol; i <= rightCol; i++) {
                mat[topRow][i] = value++;
            }
            topRow++;

            for (int i = topRow; i <= bottomRow; i++) {
                mat[i][rightCol] = value++;
            }
            rightCol--;

            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    mat[bottomRow][i] = value++;
                }
                bottomRow--;
            }

            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    mat[i][leftCol] = value++;
                }
                leftCol++;
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
