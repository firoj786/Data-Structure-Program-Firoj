package com.nt.dublyLinklist;

public class App {

	public static void main(String[] args) {
		DublyLinkList D=new DublyLinkList();
		D.insertFirst(22);
		D.insertFirst(44);
       D.insertFirst(66);
		D.insertLast(11);
		D.insertLast(33);
		D.insertLast(55);
		D.insertMid(99);
		D.deleteMid();
		//System.out.println("Delete:"+D.deleteMid());
		D.displayForward();
		D.displayBackward();
		D.deleteFirst();
		D.deleteLast();
		D.deletekey(11);
		D.displayForward();
		D.insertAfter(22, 77);
		D.insertAfter(33, 88);
		D.displayForward();
        
	}

}
