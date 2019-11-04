package com.nt.Array;

public class TwoDArrayOneLoop{
    public static void main(String[] args) {
        int r=3;
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0,j=0;i<3 && j<3;j++){
            System.out.print(arr[i][j]+" ");
        
        if(arr[i][j]==r){
            i++;
            j=-1;
            System.out.println();
                r=r+r;
        }
        }
    }
}