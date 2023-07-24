package com.kashish.tutorial.java.practise;

import java.util.Scanner;

public class PartitionLinkedList {

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {

		Node head = new Node(2);
		head.next = new Node(8);
		head.next.next = new Node(1);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(6);

		int size = 0;
		Node curr = head;
		while (curr != null) {
			curr = curr.next;
			size++;
		}
		System.out.print("Partion:");
		Scanner sc = new Scanner(System.in);
		int partition = sc.nextInt();
		int[] arr = new int[size];
		int i = 0;
		int k=0;
		Node currNode = head;
		while (i+k < size) {
			int nodeValue = currNode.data;
			if (nodeValue < partition) {
				arr[i] = nodeValue;
				i++;
				
			} else {
				arr[size - 1 - k] = nodeValue;
				k++;
			}
			currNode = currNode.next;
			
		}
		newLinkedList(arr, size);

		sc.close();
	}

	public static void newLinkedList(int[] arr, int size) {
		Node head = new Node(arr[0]);
		Node currentNode = head;
		int j = 1;
		while (j < (size)) {
			currentNode.next = new Node(arr[j]);
			currentNode = currentNode.next;
			j++;
		}
		printLinkedList(head);

	}

	public static void printLinkedList(Node head) {

		System.out.println("New Linked List:");
		while (head != null) {
			System.out.print(head.data + "->");
			head = head.next;
		}
		System.out.print("null");
	}

}
