package com.nt.sorting;

class InsertionSort{
    public static int [] sort(int a[]){
        for(int i=1;i<a.length;i++){
            int ele=a[i];
            int j=i-1;
            while(j>=0 && a[j]>ele){
              a[j+1]=a[j];
              j--;
            }
            a[j+1]=ele;
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={25,47,3,19,8,18};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}