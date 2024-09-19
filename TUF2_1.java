package com.take.u.forward;

public class TUF2_1 {
	public static void main(String[] args) {
		printNameNTimes(0,5);
	}
	static void printNameNTimes(int i,int n) {
		
		if(i==n) {
			return;
		}
		System.out.println("sarvesh");
		printNameNTimes(i+1,n);
	}
}
