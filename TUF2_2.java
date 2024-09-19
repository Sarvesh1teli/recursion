package com.take.u.forward;

public class TUF2_2 {
	public static void main(String[] args) {
		print_N_1(4);
	}
	static void print_N_1(int i) {
		if(i<1) {
			return;
		}
		System.out.println(i);
		print_N_1(i-1);
	}
}
