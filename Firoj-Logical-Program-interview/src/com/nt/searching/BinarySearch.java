package com.nt.searching;
public class BinarySearch {
	public static int search(int a[], int x) {
		int p = 0;
		int r = a.length - 1;
		while (p <= r) {
			int q = (p + r) / 2;
			if (x < a[q])
				r = q - 1;
			else if (x > a[q])
				p = q +1;
			else
				return q;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10 };
		int x = 8;
		System.out.println(search(arr, x)+" ");
	}

}
