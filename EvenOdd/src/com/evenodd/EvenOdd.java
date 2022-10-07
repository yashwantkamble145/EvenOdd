package com.evenodd;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	try (Scanner sc = new Scanner (System.in)) {
		System.out.println("Enter Your Number");
		int num = sc.nextInt();
		
		if(num%2 == 0) {
				System.out.println("Even Number");
		}
		else 
			System.out.println("odd number");
	}
	}
}