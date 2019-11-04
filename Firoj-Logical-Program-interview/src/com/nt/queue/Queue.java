package com.nt.queue;

public class Queue {
	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int nItem;

	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[size];
		front = 0;
		rear = -1;
		nItem = 0;
	}

	public void insert(long j) {
		if(rear==maxSize-1) {
			rear=-1;
		}
		rear++;
		queueArray[rear] = j;
		nItem++;
	}
	public long remove() {//remove item from front
		long temp=queueArray[front];
		front++;
		if(front==maxSize) {
			front=0;//we can set front back to 0th index
		}
		nItem--;
		return temp;
		
	}
	public long peekFront() {
		return queueArray[front];
	}
	public boolean isEmpty() {
		return (nItem==0);
	}
	public boolean isFull() {
		return (nItem==maxSize);
	}

	public void view() {
		System.out.print("[ ");
		for (int i = 0; i < queueArray.length; i++) {
			System.out.print(queueArray[i] + " ");
		}
		System.out.print(" ] ");
	}
}
 