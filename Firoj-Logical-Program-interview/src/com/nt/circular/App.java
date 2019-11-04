package com.nt.circular;
public class App {
public static void main(String[] args) {
		CircularLinkedList c=new CircularLinkedList();
		c.insertFirst(100);
		c.insertFirst(50);
		c.insertFirst(88);
		c.insertLast(99);
		c.insertMid(22);
		c.displayList();
		c.deleteFirst();
		c.deleteLast();
		c.deleteMid();

	//	System.out.println("delete ele:"+c);
		System.out.println("_____________________________");
          c.displayList();
	}

}
