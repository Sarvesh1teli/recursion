package com.take.u.forward;

public class TUF3_SumOfN {
	public static void main(String[] args) {
		summationOfN(3,0);
	}
	static void summationOfN(int i,int sum) {
		if( i < 1) {
			System.out.println(sum);
			return;
		}
		sum = sum+i;
		summationOfN(i-1,sum);
	}
}
