package com.take.u.forward;


public class TUF4_Palindrome2 {
	public static void main(String[] args) {
		
		boolean b = palindrome("11211",0,4);
		System.out.println(b);
	}
	static boolean palindrome(String str,int i,int n) {
		if(i>=n/2) {
			return true;
		}
		if(str.charAt(i)!= str.charAt(n)) {
			return false;
		}
		return palindrome(str,i+1,n-1);
	}
}
