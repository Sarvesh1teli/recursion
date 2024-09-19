package com.take.u.forward;

import java.util.*;

public class TUF_8_CombinationSum1 {
	public static void main(String[] args) {
		int a[] = { 2, 3, 6, 7 };
		List<List<Integer>> ans = combinationSum(a, 7);
		System.out.println(ans);
	}

	public static List<List<Integer>> combinationSum(int[] a, int target) {
		List<List<Integer>> ans = new ArrayList();
		findSubSequenceSum(0, a, target, new ArrayList(), ans, a.length - 1);
		return ans;
	}

	private static void findSubSequenceSum(int i, int[] a, int target, List<Integer> ds, List<List<Integer>> ans,
			int n) {
		if (i > n) {
			// condition satisfied
			if (target == 0) {
				ans.add(new ArrayList<Integer>(ds));
				// System.out.println(ans);
			}
			return;
		}
		// pick element
		if (target >= a[i]) {
			ds.add(a[i]);
			findSubSequenceSum(i, a, target - a[i], ds, ans, n);
			ds.remove(ds.size() - 1);
		}
		// non pick element
		findSubSequenceSum(i + 1, a, target, ds, ans, n);
	}
}
/* [[2, 2, 3], [7]] */