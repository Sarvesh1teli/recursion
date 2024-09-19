package com.take.u.forward;

public class TUF2_4_Backtrack {
	public static void main(String[] args) {
		print_1_N(3,3);
	}
	static void print_1_N(int i,int n) {
		if(i<1) {
			return;
		}
		print_1_N(i-1,n);
		System.out.println(i);
	}
}
