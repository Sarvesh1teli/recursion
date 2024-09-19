package com.take.u.forward;

public class TUF3_FactorialFun3 {
	public static void main(String[] args) {
		int sum = 	factorial(4);
		System.out.println(sum);
	}
	static int factorial(int n) {
		if( n < 1) {
			return 1;
		}
		return n*factorial(n-1);
	}
}
