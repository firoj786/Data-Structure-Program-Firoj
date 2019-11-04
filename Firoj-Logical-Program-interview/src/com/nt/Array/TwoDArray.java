package com.nt.Array;

public class TwoDArray {
   public static void main(String[] args) {
      int[][] a = {{1,-2,3,6},{4,-5,6,9},{7,7,1,2},{4,9,0,8}};
       for (int i = 0; i < a.length; i++) {
        for(int j = 0; j < a[i].length; j++) {
           System.out.print(a[i][j]+" ");
        }
        System.out.println();
     }
   }
}