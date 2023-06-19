package com.kashish.tutorial.java.practise;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;

		for (int j = 1; j <= a; j++) {
			if (a % j != 0 && a != j) {
				b++;
			}
		}

		if (b == (a - 2)) {
			System.out.println("It is a prime number.");
		} else {
			System.out.println("It is not a prime number.");
		}
	}
}
