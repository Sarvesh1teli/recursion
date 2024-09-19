package com.take.u.forward;

import java.util.Arrays;

public class TUF4_Reverse_Array {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,2};
		reverseArray(a,0,4);
		 int aa[]= {1,2,3,4,2};
		reverseArray_2(aa,0,5);
	}
	static void reverseArray(int a[],int l,int r) {
		if( l>=r) {
			System.out.println(Arrays.toString(a));
			return ;
		}
		swap(a,l,r);
		reverseArray(a,l+1,r-1);
	}
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i]=a[j];
		a[j]=temp;
	}
	private static void swap2(int[] aa, int i, int j) {
		int temp = aa[i];
		aa[i] = aa[j];
		aa[j]=temp;
	}
	
	static void reverseArray_2(int aa[],int i,int N) {
		if( i>=N/2) {
			System.out.println(Arrays.toString(aa));
			return ;
		}
		swap2(aa,i,(N-i-1));
		reverseArray_2(aa,(i+1),(N-i-1));
	}
}
