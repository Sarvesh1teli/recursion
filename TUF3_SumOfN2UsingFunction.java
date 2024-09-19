package com.take.u.forward;

public class TUF3_SumOfN2UsingFunction {
	public static void main(String[] args) {
	int sum = 	summationOfN(3);
		System.out.println(sum);
	}
	static int summationOfN(int n) {
		if( n < 1) {
			return 0;
		}
		return n+summationOfN(n-1);
	}
}
