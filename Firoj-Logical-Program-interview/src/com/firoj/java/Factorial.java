package com.firoj.java;
import java.util.Scanner;
public class Factorial {
public static void main(String[] args) {
	int fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no:");
	int n=sc.nextInt();
	System.out.print("Factorial:");
	for (int i = 1; i <=n; i++) {
		fact=fact*i;
		}
	System.out.println(fact+"  ");

	}

}
