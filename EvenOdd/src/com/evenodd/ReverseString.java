package com.evenodd;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String originalString, reverse = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to reverse ");
		originalString = in.nextLine();

		int length = originalString.length();

		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + originalString.charAt(i);
		System.out.println("Reverse of the string " + reverse);
		in.close();
	}
}
