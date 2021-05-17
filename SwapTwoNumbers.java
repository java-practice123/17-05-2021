package com.example.javabasics;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		/**
		 * with thrird variable
		 */
		int temp =0;
		temp = a;//10
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		/** 
		 * without third variable
		 * a= a+b=30
		 * b= a-b=10
		 * a= a-b=20
		 */
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+ " "+b);
		
		
	}
}
