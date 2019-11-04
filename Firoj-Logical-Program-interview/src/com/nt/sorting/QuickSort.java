package com.nt.sorting;

import java.util.Arrays;
class QuickSort {
	public static void quickSort(int arr[], int start, int end) {
		if (start < end) {
			int p = partition(arr, start, end);
			quickSort(arr, start, p - 1);
			quickSort(arr, p + 1, end);

		}
	}

	public static int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int i = start - 1;
		for (int j = start; j <= end - 1; j++) {
			if (arr[j] <= pivot) {
				i++;
				int ival = arr[i];
				int jval = arr[j];
				arr[i] = jval;
				arr[j] = ival;
			}

		}
		int ival = arr[i + 1];
		arr[end] = ival;
		arr[i + 1] = pivot;
		return i + 1;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 7, 3, 4, 2, 9, 10, 1, 6 };
		quickSort(arr, 0, arr.length - 1);
		System.out.print(Arrays.toString(arr));
	}
}