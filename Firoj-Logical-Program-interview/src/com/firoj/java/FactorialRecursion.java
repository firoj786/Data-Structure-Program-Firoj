package com.firoj.java;
import java.util.Scanner;
public class FactorialRecursion {
	public static long factorial(int i) {
	      if(i <= 1) {
	         return 1;
	      }
	      return i * factorial(i - 1);
	   }
	   public static void main(String args[]) {
		  // int i=6;
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the  factorial no:"); 
		  int i = sc.nextInt();
		 System.out.println(factorial(i)+" ");
	   }
	}