package com.nt.searching;
public class LinearSeach {
	public static int linear(int a[],int x ) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==x) {
				return i;
			}
				}
		return -1;
	}
public static void main(String[] args) {
		int arr[]= {2,4,3,6,7,5,9};
		int x=10;
		System.out.println(linear(arr,x));

	}

}
