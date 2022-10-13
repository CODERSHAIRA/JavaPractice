package com.kashish.tutorial.java.practise;
import java.util.Random;
import java.util.Scanner;

 class Game {
 public int n;
 public int userInput;
 public int noOfGuesses;
	public Game() {
		Random rd=new Random();
		this.n=rd.nextInt(100);
	
	}
	
	public void toTakeUserInput() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Guess the number: ");
	 userInput=sc.nextInt();
	
	}
	public boolean isCorrectNumber() {
		if(userInput==n) {
			return true;
		}
		else if(userInput<n) {
			System.out.println("number is less than the required number");
		}
		else if(userInput>n) {
			System.out.println("number is greater than the required number");
		}
		
			return false;
	}
	 public int getnoOfGuesses() {
		
		return noOfGuesses;
	}
	 
     public void setnoOfGuesses(int a) {
    	 this.noOfGuesses=a;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game g=new Game();
		g.toTakeUserInput();
		boolean b=g.isCorrectNumber();
		int y=0;
		while(!b) {
			g.toTakeUserInput();
			 b=g.isCorrectNumber();
			 y++;
		}
		g.setnoOfGuesses(y);
		System.out.print("the number of guesses are: "+g. getnoOfGuesses());
	}

	}
