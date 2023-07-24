package com.kashish.tutorial.java.practise;

public class SumList {

	int sum;
	
	public SumList(int s1, int s2) {
		this.sum = s1+s2;
		System.out.println("Sum of Linked List1 and Linked List2:"+sum);
	}
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	public static int linkedList1() {
		Node head1= new Node(7);
		head1.next= new Node(1);
		head1.next.next= new Node(6);
		
		Node prev1=null;
		Node next=null;
		Node curr=head1;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev1;
			prev1=curr;
			curr=next;
		}
		Node prev11=prev1;
		StringBuffer sb1=new StringBuffer();
		while(prev1!=null) {
			sb1=sb1.append(prev1.data);
			prev1=prev1.next;
		}
		int s1=Integer.parseInt(sb1.toString());
		System.out.println("String1: "+sb1);
		System.out.println("New Input Linked List1: ");
		
	    printLinkedList(prev11);
		return s1;
	
	}
	public static int linkedList2() {
		Node head2= new Node(5);
		head2.next= new Node(9);
		head2.next.next= new Node(2);
		
		Node prev2=null;
		Node next=null;
		Node curr=head2;
		while(curr!=null) {
			next=curr.next;
			curr.next=prev2;
			prev2=curr;
			curr=next;
		}
		Node prev22=prev2;
		StringBuffer sb2=new StringBuffer();
		while(prev2!=null) {
			sb2=sb2.append(prev2.data);
			prev2=prev2.next;
		}
		int s2=Integer.parseInt(sb2.toString());
		System.out.println("String2: "+sb2);
		System.out.println("New Input Linked List2: ");
		printLinkedList(prev22);
		return s2;
		
	}
	public static void printLinkedList(Node node) {
		while(node!=null) {
			System.out.print(node.data+"->");
			node=node.next;
		}
		System.out.println("null");
	}
	public static void main(String[] args) {

		
		int s1=linkedList1();
		int s2=linkedList2();
		
		SumList sl= new SumList(s1, s2);
		sl.printOutputLinkedList();
		
	}
	
	public void printOutputLinkedList() {
		System.out.println("Output Linked List: ");
		while(sum!=0) {
			int s=sum%10;
			Node head3= new Node(s);
			System.out.print(head3.data+"->");
			head3=head3.next;
			sum=sum/10;
		}
		System.out.print("null");
	}
}
