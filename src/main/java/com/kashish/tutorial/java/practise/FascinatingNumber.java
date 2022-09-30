package com.kashish.tutorial.java.practise;
import java.util.Scanner;
class FascinatingNumber{



	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
int num=scanner.nextInt();



int a=num*2;

System.out.println(a);
int b=num*3;
System.out.println(b);

String s1=Integer.toString(num);
String s2=Integer.toString(a);
String s3=Integer.toString(b);

String s=s1+s2+s3;
int c=Integer.parseInt(s);
System.out.println(c);
int count=0;
int cc=c;
while(c!=0) {

 

c=c/10;
++count;
}

System.out.println(count);
int[] myArray=new int[count];
System.out.print("{");
for(int i=0; i<count; i++) {
	
	int rem=cc%10;
	

	
	myArray[i]=rem;
	System.out.print(myArray[i]);
	System.out.print(",");
	cc=cc/10;
}
System.out.print("}");
System.out.print("\n");
int k=0;

for(int i=0; i<myArray.length; i++) {
	for(int j=0; j<myArray.length; j++) {
		if(i!=j) {
			if(myArray[i]==myArray[j]) {
				
				++k;
			}
			
		}
	}
	
}
if(k>=1) {
System.out.println("it is not a fascinating number");
}
else {
	System.out.println("it is a fascinsting number");
}
	}
	

}
