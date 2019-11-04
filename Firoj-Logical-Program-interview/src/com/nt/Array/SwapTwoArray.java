package com.nt.Array;

class SwapTwoArray{
    public static void main(String[] args) {
        int a[]={1,3,5,7,8,4,9};
        int num=0;
        int n=8;
        int temp=a[num];
        a[0]=a[4];
        a[4]=temp;
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]+" ");
        System.out.println();

    }
}