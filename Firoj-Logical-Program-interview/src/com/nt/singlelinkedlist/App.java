package com.nt.singlelinkedlist;

public class App {

	public static void main(String[] args) {
		SingleLinkedList l=new SingleLinkedList();
		l.insertFirst(100);
		l.insertFirst(50);
       l.insertFirst(99);
		l.insertFirst(88);
		l.insertLast(999999);
          l.displayList();
          l.deleteMid();
          l.insertMid(777);
		/*
		 * System.out.println("____________________________"); l.deleteLast(); //
		 * System.out.println("deleted ele is: "+l.deleteLast().data);
		 * System.out.println("+++++++++++++++++++");
		 */
          l.displayList();
	}

}
