package com.take.u.forward;

import java.util.ArrayList;
import java.util.List;

public class TUF_13_PermutationAppr2 {
	
	public static void main(String[] args) {
		int a[] = {1,2};
		int n = a.length;
		
		permute2(a, n);
	}
	static List<List<Integer>> permute2(int a[],int n){
		List<List<Integer>> ans = new ArrayList();
		
		permuationCombApproach2(0,a,ans);
		System.out.println(ans);
		return ans;
	}
	private static void permuationCombApproach2(int ind,int[] a, List<List<Integer>> ans) {
		
		if(ind == a.length) {
			List<Integer> ds = new ArrayList<>();
			for(int i=0;i<a.length;i++) {
				ds.add(a[i]);
			}
			ans.add(new ArrayList<Integer>(ds));
			return;
		}
		
		for(int i=ind;i<a.length;i++) {
			swap(i,ind,a);
			permuationCombApproach2(ind+1, a, ans);
			swap(i,ind,a);
		}
		
	}
	private static void swap(int i, int ind, int[] a) {
		int temp = a[i];
		a[i]=a[ind];
		a[ind]=temp;
	}
}
//[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 2, 1], [3, 1, 2]]