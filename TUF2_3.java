package com.take.u.forward;

public class TUF2_3 {
	public static void main(String[] args) {
		print_1_N(1,5);
	}
	static void print_1_N(int i,int n) {
		if(i>n) {
			return;
		}
		System.out.println(i);
		print_1_N(i+1,n);
	}
}
