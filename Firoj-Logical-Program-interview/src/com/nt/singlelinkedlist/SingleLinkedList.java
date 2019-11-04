package com.nt.singlelinkedlist;
public class SingleLinkedList {
	private Node first;
    private Node last;
	public boolean isEmpty() {
return (first==null);
	}
	public void insertFirst(int data) {
		Node newNode=new Node();
		newNode.data=data;
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
		Node current=first;
		while(current.next!=null) {
			current=current.next;
		}
		Node newNode=new Node();
		newNode.data=data;
		current.next=newNode;
	}
	

	public Node deleteFirst() {
	Node temp=first;
	first=first.next;
	return temp;
	}
public int deleteLast() {
	Node current = first;
	while (current.next.next!= null) 
	    current = current.next;
	int result = current.next.data;
	current.next = null;
	return result;
	}
	public void displayList() {
		System.out.println("List(First--->Last)");
		Node current=first;
		while(current!=null) {
			current.displayNode();
			current=current.next;
			
		}
	
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
	public void deleteMid() {
		int len = lengthOfList();
		Node remNode = first;
		for(int i=0;i<len/2-1;i++) {
			remNode = remNode.next;
		}
		remNode.next = remNode.next.next;
	}
}
