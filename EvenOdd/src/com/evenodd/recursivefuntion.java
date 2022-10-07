package com.evenodd;

public class recursivefuntion {
 public static void printFrom1To100(int N) {
	 if (N == 100) {
		 System.out.println(100);
		 return;
		 
	 }
	 System.out.println(N+ " ");
	 printFrom1To100(N + 1);
	 
 }
 public static void main(String[] args) {
	printFrom1To100(1);
}
}
