package com.take.u.forward;

import java.util.ArrayList;

public class TUF_7_AnySubSeqSum2 {

	public static void main(String[] args) {
		int a[] = { 1, 1, 2 };
		int k = 2;
		int sum = 0;
		findSubSequenceSum(0, a, new ArrayList<Integer>(), a.length - 1, sum, k);
	}

	private static boolean findSubSequenceSum(int i, int[] a, ArrayList<Integer> list, int n, int sum, int k) {
		if (i > n) {
			//condition satisfied
			if (sum == k) {
				System.out.println(list);
				return true;
			}
			else 
				return false;
		}
		// pick element
		list.add(a[i]);
		sum = sum + a[i];
		if(findSubSequenceSum(i + 1, a, list, n, sum, k) == true) {
			return true;
		}
		// non pick element
		sum = sum - a[i];
		list.remove(list.size() - 1);
		if( findSubSequenceSum(i + 1, a, list, n, sum, k) == true) {
			return true;
		}
		return false;
	}
}
/*
 * [1, 1]
 */