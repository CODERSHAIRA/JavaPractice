package com.kashish.tutorial.java.practise;
import java.util.Scanner;
public class KeithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int num = in.nextInt();
	    
	        String st = String.valueOf(num);
	        int len = st.length();
	        System.out.println("Length of input is "+len);
	        int[] arr=new int[len];
	        for(int i=0; i<len; i++){
	            arr[i] = Character.getNumericValue(st.charAt(i));
	            System.out.print(arr[i]+" ");
	        }
	        int sum=0;
	        
	        while(sum < num){
	            sum=0;
	            for(int i=0; i<len; i++){
	                sum = sum+arr[i];
	            }
	            System.out.println(sum);
	            for(int j=1; j<len;j++){
	                arr[j-1]=arr[j];
	            }
	            arr[len-1] = sum;
	        }
	        
	        if(sum == num){
	            System.out.println("Keith number");
	        }else{
	            System.out.println("Not a Keith number");
	        }
	        
	    }
	
	

}



    
       