package com.take.u.forward;

import java.util.ArrayList;

public class TUF_7_CountSubSeqSum3 {
	public static void main(String[] args) {
		int a[] = { 1, 1, 2 };
		int k = 2;
		int sum = 0;
		int count = findSubSequenceSum(0, a, new ArrayList<Integer>(), a.length - 1, sum, k);
		System.out.println("count:" + count);
	}

	private static int findSubSequenceSum(int i, int[] a, ArrayList<Integer> list, int n, int sum, int k) {
		if (i > n) {
			// condition satisfied
			if (sum == k) {
				System.out.println(list);
				return 1;
			} else
				return 0;
		}
		// pick element
		list.add(a[i]);
		sum = sum + a[i];
		int l = findSubSequenceSum(i + 1, a, list, n, sum, k);

		// non pick element
		sum = sum - a[i];
		list.remove(list.size() - 1);
		int r = findSubSequenceSum(i + 1, a, list, n, sum, k);
		return l + r;
	}
}
/*
 * [1, 1][2] count:2
 */