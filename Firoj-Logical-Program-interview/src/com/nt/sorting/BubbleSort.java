package com.nt.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void bubble(int a[]) {
		int n = a.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 8, 6, 5, 9, 10, 2, 1, 0, 3, 4 };
		bubble(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
