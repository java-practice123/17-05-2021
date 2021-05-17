package com.example.javabasics;

public class JavaVariables {
// instance variable-- Scope,access
	//static variable -- 
	//local variable
	int input1 = 10;
	static String company = "Global Logic";
	public static void main(String[] args) {
		int a=1;
		System.out.println(a);
		System.out.println(company);
		JavaVariables object = new JavaVariables();
		object.m1();
	}
	 void m1(){
		System.out.println(input1);
		System.out.println(company);
	}
}
