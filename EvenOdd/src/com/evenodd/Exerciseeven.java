package com.evenodd;

import java.util.Scanner;

public class Exerciseeven {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if (num %2 ==0) {
			System.out.println("Given number is even");
		}
		else 
			System.out.println("Given number is odd");
			
		}
	}
}