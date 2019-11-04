package com.nt.Array;

import java.util.Scanner;
class SumArrayTok{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
             int arr[]={1,5,6,2};
             System.out.println("Enter value of k;");
             int k=sc.nextInt();
             System.out.println(SumTok(arr,k));
    }
    public static boolean SumTok(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
        }
        return false;
    }
}