package com.kashish.tutorial.java.practise;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("0 for Rock");
System.out.println("1 for Paper");
System.out.println("2 for Scissor");
int userChoice=sc.nextInt();

Random rd=new Random();
int computerChoice=rd.nextInt(3);

if(userChoice==computerChoice) {
	System.out.print("draw");
	
}
else if(userChoice == 0 && computerChoice == 2 || userChoice == 1 && computerChoice == 0
|| userChoice == 2 && computerChoice == 1) {
System.out.println("You Win!");
} else {
System.out.println("Computer Win!");
}
if(computerChoice==0){
    System.out.println("Computer choice: Rock");
}
else if(computerChoice==1){
    System.out.println("Computer choice: Paper");
}
else if(computerChoice==2){
    System.out.println("Computer choice: Scissors");
	}
	}
}
