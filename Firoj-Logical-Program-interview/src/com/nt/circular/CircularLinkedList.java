package com.nt.circular;
import com.nt.singlelinkedlist.Node;
public class CircularLinkedList {
	private Node first;
	private Node last;
	public CircularLinkedList() {
	first=null;
		last=null;
	}
	public int lengthOfList() {
		Node temp = first;
		int len=0;
		while(temp !=null) {
			len++;
			temp = temp.next;
		}
		return len;
		
	}
	private boolean isEmpty() {
		return first==null;
	}
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;
		if(isEmpty()) {
			last=newNode;
		}
		newNode.next=first;
		first=newNode;
	}
	public void insertMid(int data) {
		int len = lengthOfList();
		Node newNode = new Node();
		newNode.data =data;
		Node tempNode = first;
		for(int i=0;i<len/2-1;i++) {
			tempNode = tempNode.next;
		}
		newNode.next =tempNode.next;
		tempNode.next = newNode;
	}
	public void insertLast(int data) {
		Node newNode=new Node();
		newNode.data=data;
		if(isEmpty()) {
			first=newNode;
		}
		else {
			last.next=newNode;
			last=newNode;
		}
	}
	public int deleteFirst() {
		int temp=first.data;
		if(first.next==null) {
			last=null;
		}
		first=first.next;
		return temp;
	}
	public void deleteMid() {
		int len = lengthOfList();
		Node remNode = first;
		for(int i=0;i<len/2-1;i++) {
			remNode = remNode.next;
		}
		remNode.next = remNode.next.next;
	}
	public int deleteLast() {
		Node current = first;
		while (current.next.next!= null) 
		    current = current.next;
		int result = current.next.data;
		current.next = null;
		return result;
		}
public void displayList(){
	System.out.println("List(First--->Last)");
	Node current=first;
	while(current!=null) {
		current.displayNode();
		current=current.next;
	}
}
}
