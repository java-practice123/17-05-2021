package com.example.javabasics;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 123;
		/**
		 * 123--321 number = 123 reminder=number%10--123%10--3 sum = sum * 10+reminder
		 * -- 3 number = number/10 --12
		 */
		int sum = 0,n=number;
		while (n > 0) {
			int reminder = n % 10;
			sum = sum * 10 + reminder;
			n = n / 10;
		}
		System.out.println("Before Reverse a number");
		System.out.println(number);
		System.out.println("After Reverse a number");
		System.out.println(sum);
	}
}
