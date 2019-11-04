package com.nt.sorting;

public class SelectionSort {
	public static int[] selection(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {// if be finde smallar value
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}

		return a;
	}

	public static void main(String[] args) {
		int arr[] = { 25, 47, 3, 19, 18, 2 };
		selection(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}
	}
}