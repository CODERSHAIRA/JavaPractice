package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class AtmProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalBalance=10000;
Scanner scanner=new Scanner(System.in);
System.out.print("select an option: ");
int option=scanner.nextInt();
int depositMoney=3000;
int withdrawMoney=2000;
int checkBalance=totalBalance;

if(option==1)
	System.out.print("total amount left: "+(totalBalance-withdrawMoney));
if(option==2)
	System.out.print("total amount left: "+(totalBalance+depositMoney));
if(option==3)
	System.out.print("check balance: "+(totalBalance));
if(option==4)
	System.exit(0);
	}

}
