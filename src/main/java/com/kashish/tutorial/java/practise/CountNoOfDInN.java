package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class CountNoOfDInN {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int D=sc.nextInt();
		int l=0;
		while(N!=0) {
			int a=N%10;
			if(a==D) l++;
			N=N/10;
			
		}
		System.out.print(l);
		sc.close();
	}

}
