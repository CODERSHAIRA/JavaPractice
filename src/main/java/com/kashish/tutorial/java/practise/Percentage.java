package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
				float m1;
				float m2;
				float m3;
				float m4;
				float m5;
				
				Scanner scanner=new Scanner(System.in);
				System.out.print("m1: ");
				m1=scanner.nextFloat();
				System.out.print("m2: ");
				m2=scanner.nextFloat();
				System.out.print("m3: ");
				m3=scanner.nextFloat();
				System.out.print("m4: ");
				m4=scanner.nextFloat();
				System.out.print("m5: ");
		  
		        m5=scanner.nextFloat();
		 float percentage=(m1+m2+m3+m4+m5)/500f*100;
			        System.out.println(percentage);
			         
		        		
		        		
			}
		}