package com.nt.Array;

public class RearrangeArray {
	public static void main(String args[]) {
//		int arr[] = {9,2,8,4,5,7,6,0};
		int arr[] = {1,2,1,4,0,5,6,0};
		int n = arr.length;
		int minSumArray[] = new int[n];
		int j = n-1;
		int sum = 0;
		sortArr(arr, n);
//		printArr(arr, n);
		
		for(int i=0; i<n; i++) {
			if(i%2 == 0){
				sum += arr[i]*arr[j];
				minSumArray[i] = arr[i];
				minSumArray[i+1] = arr[j];
			}
			j--;
		}
		System.out.println(sum);
		printArr(minSumArray, n);
	}
	
	public static void sortArr(int a[], int n) {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static void printArr(int a[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
