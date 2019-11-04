package com.nt.sorting;

public class MergeSort {
	public static void sort(int arr[]) {
		sort(arr, 0, arr.length - 1);
	}

	public static void sort(int arr[], int start, int end) {
		if (end <= start) {
			return;
		}
		int mid = (start + end) / 2;
		sort(arr, start, mid);
		sort(arr, mid + 1, end);
		merge(arr, start, mid, end);
	}

	public static void merge(int arr[], int start, int mid, int end) {
		int tempArray[] = new int[end - start + 1];
		int leftSlot = start;
		int rightSlot = mid + 1;
		int k = 0;
		while (leftSlot <= mid && rightSlot <= end) {
			if (arr[leftSlot] < arr[rightSlot]) {
				tempArray[k] = arr[leftSlot];
				leftSlot = leftSlot + 1;
			} else {
				tempArray[k] = arr[rightSlot];
				rightSlot = rightSlot + 1;
			}
			k = k + 1;
		}
		if (leftSlot <= mid) {
			while (leftSlot <= mid) {
				tempArray[k] = arr[leftSlot];
				leftSlot = leftSlot + 1;
				k = k + 1;
			}
		} else if (rightSlot <= end) {
			while (rightSlot <= end) {
				tempArray[k] = arr[rightSlot];
				rightSlot = rightSlot + 1;
				k = +1;
			}
		}
		for (int i = 0; i < tempArray.length; i++) {
			arr[start + i] = tempArray[i];
		}
	}

	public static void main(String[] args) {
		int arr[] = { 9, 7, 3, 1, 6, 3, 2, 6, 8, 9, 2, 3, 0 };
		MergeSort m = new MergeSort();
		m.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
