package com.kashish.tutorial.java.practise;

public class DeleteMiddleNodeFromLinkedList {

	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
		
		
	}
	public static void main(String[] args) {

		Node head= new Node(12);
		head.next= new Node(3);
		head.next.next= new Node(71);
		head.next.next.next= new Node(1);
		head.next.next.next.next= new Node(9999);
		head.next.next.next.next.next= new Node(23);
		head.next.next.next.next.next.next= new Node(101);
		head.next.next.next.next.next.next.next= new Node(50);
		head.next.next.next.next.next.next.next.next= new Node(71);
		
		Node prev=head;
		Node node=head.next;
		Node curr=head.next;
		while(curr!=null) {
			curr=curr.next.next;
			node=node.next;
			prev=prev.next;
		}
		deleteNode(prev, node);
		printLinkedList(head);
	}
	public static void printLinkedList(Node head) {

		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		
	}
	public static void deleteNode(Node prev, Node node) {
		prev.next=node.next;
	}

}
