package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class MultiplicaionTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<11; i++) {
			System.out.print(n+"x"+i+ "=" +n*i);
			System.out.print("\n");
		}

	}

}
