package com.nt.dublyLinklist;
public class DublyLinkList {
private Node first;
private Node last;
public DublyLinkList() {
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

public boolean isEmpty() {
	return first==null;
}
public void insertFirst(int data) {
	Node newNode=new Node();
	newNode.data=data;
	if(isEmpty()) {
		last=newNode;
	}
	else {
		first.previous=newNode;
	}
	newNode.next=first;
	this.first=newNode;
}
public void insertMid(int data) {
	int len = lengthOfList();
	Node newNode = new Node();
	newNode.data =data;
	Node temp = first;
	for(int i=1;i<len/2;i++) {
		temp = temp.next;
	}
	newNode.next =temp.next;
	newNode.previous = temp.previous.next;
	temp.next.previous = newNode;
	temp.next = newNode;

	
}
public void insertLast(int data) {
	Node newNode=new Node();
	newNode.data=data;
	if(isEmpty()) {
		first=newNode;
		
	}
	else {
		last.next=newNode;
		newNode.previous=last;
	}
	last=newNode;
}
public Node deleteFirst() {
	Node temp=first;
	if(first.next==null) {
		last=null;
	}else {
		first.next.previous=null;
	}
	first=first.next;//we are assinning the refrence of the node followingthe old first node to the field in the linked list object
	return temp;//return the delete old first node
}
public Node deleteLast() {
	Node temp=last;
	if(first.next==null) {//we only have one node in this list
		first=null;
	}else {
		last.previous.next=null;
	}
	last=last.previous;
	return temp;
}
public boolean insertAfter(int key,int data) {
	Node current=first;
	while(current.data!=key) {
		current=current.next;
		if(current==null) {
			return false;
		}
	}
	Node newNode=new Node();
	newNode.data=data;
	if(current==last) {
		current.next=null;
		last=newNode;
		
	}else {
		newNode.next=current.next;
		current.next.previous=newNode;
	}
	newNode.previous=current;
	current.next=newNode;
	return true;
}
public Node deletekey(int key) {
	Node current=first;
	while(current.data!=key) {
		current=current.next;
		if(current==null) {
			return null;
		}
	}
	if(current==first) {
		first=current.next;
	}else {
		current.previous.next=current.next;
	}
	if(current==last) {
		last=current.previous;
	}else {
		current.next.previous=current.previous;
	}
	return current;
}
public void displayForward() {
	System.out.print("List(first--->last):");
	Node current=first;
	while(current!=null) {
		current.displayNode();
		current=current.next;
	}
	System.out.println();
}
public void displayBackward() {
	System.out.print("List(last--->first):");
	Node current=last;
	while(current!=null) {
		current.displayNode();
		current=current.previous;
	}
	System.out.println();
}
public void deleteMid() {
	int len = lengthOfList();
	Node remNode = first;
	for(int i=1;i<len/2;i++) {
		remNode = remNode.next;
	}
	Node tempNode=remNode.next;
	tempNode.previous.next = remNode.next.next;
	tempNode.next.previous=tempNode.previous;
}
}
