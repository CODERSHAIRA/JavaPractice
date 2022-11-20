package com.kashish.tutorial.java.practise;
import java.util.Scanner;
import java.util.Random;

public class HandCricket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lets play HAND CRICKET");
		Scanner sc=new Scanner(System.in);

		System.out.println("User choice is odd");
		System.out.println("Computer choice is even");
		System.out.println("Choose a number from 1 to 6: ");
		int user=sc.nextInt();
		System.out.println("Computer choose a number from 1 to 6: ");
		Random rd=new Random();
		int computer=rd.nextInt(6)+1;
		System.out.println(computer);
		  //computerChoiceInBattingOrBalling
		String ccibob = null;
		String ucibob = null;
		if((user+computer)%2==0) {
			System.out.println("Computer choice won");
		     ccibob="batting";
		}
		//userChoiceInBattingOrBalling=ucibob
		else {
			System.out.println("User choice won");
		    ucibob="batting";
		}
		if(ccibob=="batting") {
			
			int computerPoints=0;
			int userRequired=0;
			System.out.println("userPlaying points BALLING choose from 1 to 6");
			 int userPlayingPoints=sc.nextInt();
			System.out.println("computerPlaying  BATTING points choose from 1 to 6");
			 int computerPlayingPoints=rd.nextInt(6)+1;
			
			 System.out.println( computerPlayingPoints);
			 if(computerPlayingPoints!=userPlayingPoints) {
			while(computerPlayingPoints!=userPlayingPoints) {
				computerPoints=computerPoints+computerPlayingPoints;
				System.out.println("userPlaying  BALLING points choose from 1 to 6");
				 userPlayingPoints=sc.nextInt();
				System.out.println("computerPlaying BATTING points choose from 1 to 6");
				 computerPlayingPoints=rd.nextInt(6)+1;
				 System.out.println( computerPlayingPoints);
				
			}
			System.out.println("Computer scores: "+computerPoints);
			int computerscores =computerPoints;
			 userRequired=computerPoints+1;
			 }
			 else {
				 System.out.println("Computer scores: "+computerPoints);
				 int computerscores =computerPoints;
					 userRequired=computerPoints+1;
			 }
			 System.out.println("User required to score: "+userRequired);
			 int userPoints=0;
			 System.out.println("userPlaying BATTING points choose from 1 to 6");
			  userPlayingPoints=sc.nextInt();
			System.out.println("computerPlaying BALLING points choose from 1 to 6");
			  computerPlayingPoints=rd.nextInt(6)+1;
			
			 System.out.println( computerPlayingPoints);
			 
			if( userPlayingPoints<userRequired && userPlayingPoints!=computerPlayingPoints) {
				while( userPlayingPoints!=computerPlayingPoints) {
				userPoints=userPoints+userPlayingPoints;
				 if( userPoints==userRequired ) {
					 System.out.println("User scores: "+userPoints);
					 System.out.print("user wins and computer lose");
				 }
				 else {
				System.out.println("userPlaying Batting points choose from 1 to 6");
				 userPlayingPoints=sc.nextInt();
				System.out.println("computerPlaying Balling points choose from 1 to 6");
				 computerPlayingPoints=rd.nextInt(6)+1;
				 System.out.println(computerPlayingPoints);
				 if( userPlayingPoints==computerPlayingPoints) {
					 System.out.println("User scores: "+userPoints);
					 if(userPoints==userRequired) {
	            	 System.out.println("Both computer and user scores the same and the game tied");
					 }
					 else {
					 System.out.println("computer wins and user lose");
					 break;
					 }
				 }
				 }
				}
			}
			else if( userPlayingPoints<userRequired && userPlayingPoints==computerPlayingPoints) {
				System.out.println("User scores: "+userPoints);
				System.out.println("computer wins and user lose");
			}
			else if(userPlayingPoints==userRequired && userPlayingPoints!=computerPlayingPoints){
				System.out.println("User scores: "+userPlayingPoints);
				System.out.println("user wins and computer lose");
			}
			else {
				System.out.println("Both computer and user scores the same i.e 0 and the game tied");
			}
				
			 }
		//----------------------------------------------------------------------
		
		else{
			
			int userPoints=0;
			int computerRequired=0;
			System.out.println("userPlaying points BATTING choose from 1 to 6");
			 int userPlayingPoints=sc.nextInt();
			System.out.println("computerPlaying BALLING points choose from 1 to 6");
			 int computerPlayingPoints=rd.nextInt(6)+1;
			
			 System.out.println( computerPlayingPoints);
			 if(userPlayingPoints!=computerPlayingPoints) {
			while(userPlayingPoints!=computerPlayingPoints) {
				userPoints=userPoints+userPlayingPoints;
				System.out.println("userPlaying BATTING points choose from 1 to 6");
				 userPlayingPoints=sc.nextInt();
				System.out.println("computerPlaying BALLING points choose from 1 to 6");
				 computerPlayingPoints=rd.nextInt(6)+1;
				 System.out.println( computerPlayingPoints);
				
			}
			System.out.println("User scores: "+userPoints);
			int userscores =userPoints;
			 computerRequired=userPoints+1;
			 }
			 else {
				 System.out.println("user scores: "+userPoints);
				 int userscores =userPoints;
					computerRequired=userPoints+1;
			 }
			 System.out.println("Computer required to score: "+computerRequired);
			 int computerPoints=0;
			 System.out.println("userPlaying BALLING points choose from 1 to 6");
			  userPlayingPoints=sc.nextInt();
			System.out.println("computerPlaying BATTING points choose from 1 to 6");
			  computerPlayingPoints=rd.nextInt(6)+1;
			
			 System.out.println( computerPlayingPoints);
			 
			if( computerPlayingPoints<computerRequired && computerPlayingPoints!=userPlayingPoints) {
				while( computerPlayingPoints!=userPlayingPoints) {
				computerPoints=computerPoints+computerPlayingPoints;
				 if( computerPoints==computerRequired ) {
					 System.out.println("Computer scores: "+computerPoints);
					 System.out.print("computer wins and user lose");
				 }
				 else {
				System.out.println("userPlaying BALLING points choose from 1 to 6");
				 userPlayingPoints=sc.nextInt();
				System.out.println("computerPlaying BATTING points choose from 1 to 6");
				 computerPlayingPoints=rd.nextInt(6)+1;
				 System.out.println(computerPlayingPoints);
				 if( computerPlayingPoints==userPlayingPoints) {
					 System.out.println("Computer scores: "+computerPoints);
					 if(computerPoints==computerRequired) {
	            	 System.out.println("Both computer and user scores the same and the game tied");
					 }
					 else {
					 System.out.println("User wins and Computer lose");
					 break;
					 }
				 }
				 }
				}
			}
			else if( computerPlayingPoints<computerRequired && computerPlayingPoints==userPlayingPoints) {
				System.out.println("Computer scores: "+computerPoints);
				System.out.println("user wins and computer lose");
			}
			else if(computerPlayingPoints==computerRequired && computerPlayingPoints!=userPlayingPoints){
				System.out.println("Computer scores: "+computerPlayingPoints);
				System.out.println("computer wins and user lose");
			}
			else {
				System.out.println("Both computer and user scores the same i.e 0 and the game tied");
			}
				
			 }
		
		
	}
}
	


