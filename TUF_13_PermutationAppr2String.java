package com.take.u.forward;

import java.util.ArrayList;
import java.util.List;

public class TUF_13_PermutationAppr2String {
	
	public static void main(String[] args) {
		String str = "ABC";
				
		int n = str.length();
		
		permute2(str.toCharArray(), n);
	}
	static List<List<Character>> permute2(char a[],int n){
		List<List<Character>> ans = new ArrayList();
		
		permuationCombApproach2(0,a,ans);
		System.out.println(ans);
		return ans;
	}
	private static void permuationCombApproach2(int ind,char [] a, List<List<Character>> ans) {
		
		if(ind == a.length) {
			List<Character> ds = new ArrayList<>();
			for(int i=0;i<a.length;i++) {
				ds.add(a[i]);
			}
			ans.add(new ArrayList<Character>(ds));
			return;
		}
		
		for(int i=ind;i<a.length;i++) {
			swap(i,ind,a);
			permuationCombApproach2(ind+1, a, ans);
			swap(i,ind,a);
		}
		
	}
	private static void swap(int i, int ind, char[] a) {
		char temp = a[i];
		a[i] = a[ind];
		a[ind] = temp;
	}
}
//[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 2, 1], [3, 1, 2]]