package com.kashish.tutorial.java.practise;

import java.util.HashSet;


public class RemoveDups {
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next=null;
		}
	}
	public static void main(String[] args) {
		
		Node head= new Node(10);
		head.next= new Node(20);
		head.next.next= new Node(30);
		head.next.next.next= new Node(10);
		head.next.next.next.next= new Node(40);
		System.out.println("Original Linked List:");
		printLinkedList(head);
		removeDups(head);
		System.out.println("Linked List After Removing Duplicates:");
		printLinkedList(head);
	}
	public static void removeDups(Node head) {
		if(head==null || head.next==null) {
			return;
		}
		HashSet<Integer> uniqueSet= new HashSet<Integer>();
		Node current=head;
		Node prev=null;
		
		while(current!=null) {
			if(uniqueSet.contains(current.data)) {
				prev.next= current.next;
			}
			else {
				uniqueSet.add(current.data);
                prev = current;
			}
			current=current.next;
		}
	}
	public static void printLinkedList(Node head) {
		Node current= head;
		while(current!=null) {
			System.out.println(current.data+ " ");
			current=current.next;
		}
		
	}

}
