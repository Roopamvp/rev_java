package com.revature.com;

public class Factorial {
	public static long factorial(long n) { 
		if(n<1)
			return 1;
		else
			return n*factorial(n-1);
}
	public static void main(String args[]){
		int n=5;
		System.out.println(factorial(n));
		
	}
}