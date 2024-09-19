package com.take.u.forward;

import java.util.ArrayList;

public class TUF_7_SubSeqSum {

	public static void main(String[] args) {
		int a[] = { 1, 1,2 };
		int k = 2;
		int sum = 0;
		findSubSequenceSum(0, a, new ArrayList<Integer>(), a.length - 1, sum, k);
	}

	private static void findSubSequenceSum(int i, int[] a, ArrayList<Integer> list, int n, int sum, int k) {
		if (i > n) {
			if (sum == k) {
				System.out.println(list);
			}
			return;
		}
		// pick element

		list.add(a[i]);
		sum = sum + a[i];
		findSubSequenceSum(i + 1, a, list, n, sum, k);

		// non pick element
		sum = sum - a[i];
		list.remove(list.size() - 1);
		findSubSequenceSum(i + 1, a, list, n, sum, k);
	}
}
/*
 * [1, 1] [2]
 */