package com.nt.pattern;
public class PatternParamid {
public static void main(String[] args) {
        int n=5;
        int x=1;
        int y=n*2-1;
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<n*2;j++) {
        		if(j>=x && j<=y) {
        			System.out.print("*");
        		}
        		else {
        		System.out.print(" ");
        	}
        	}
        x++;
        y--;
        System.out.println();
	}
}
}
/*
          *    
        ***   
      *****  
    ******* 
 **********
*/