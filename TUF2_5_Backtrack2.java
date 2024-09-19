package com.take.u.forward;

public class TUF2_5_Backtrack2 {
	public static void main(String[] args) {
		print_N_1(1,4);
	}
	static void print_N_1(int i,int n) {
		if(i > n) {
			return;
		}
		print_N_1(i+1,n);
		System.out.println(i);
	}
}
