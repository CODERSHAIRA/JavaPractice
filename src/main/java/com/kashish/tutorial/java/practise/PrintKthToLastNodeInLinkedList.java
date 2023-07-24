package com.kashish.tutorial.java.practise;

public class PrintKthToLastNodeInLinkedList {

	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
		
	}
	public static void main(String[] args) {

		
		Node head= new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(20);
		head.next.next.next= new Node(80);
		head.next.next.next.next= new Node(99);
		head.next.next.next.next.next= new Node(34);
		head.next.next.next.next.next.next= new Node(10);
		head.next.next.next.next.next.next.next= new Node(34);
		head.next.next.next.next.next.next.next.next= new Node(62);
		Node Kth=head.next.next.next;
		
		printLinkedList(Kth);
}
	public static void printLinkedList(Node Kth) {
		while(Kth!=null) {
			System.out.print(Kth.data+ "->");
			Kth=Kth.next;
		}
		
	}
}