package com.take.u.forward;

import java.util.ArrayList;
import java.util.List;

public class TUF_12_Permutation_ExtraSpace {
	public static void main(String[] args) {
		int a[] = {1,2,3};
		int n = a.length;
		
		permute(a, n);
	}

	static List<List<Integer>> permute(int a[],int n){
		List<List<Integer>> ans = new ArrayList();
		List<Integer> ds = new ArrayList(); 
		boolean freq[] = new boolean[n];
		
		permuationComb(a,ds,ans,freq);
		System.out.println(ans);
		return ans;
	}
	
	
	private static void permuationComb(int[] a,  List<Integer> ds,List<List<Integer>> ans,boolean[] freq) {
		
		if(a.length == ds.size()) {
			ans.add(new ArrayList<Integer>(ds));
			//System.out.println(ds);
			return;
		}
		
		for(int i=0;i<a.length;i++) {
			if(!freq[i]) {
				freq[i]=true;
				ds.add(a[i]);
				permuationComb(a,ds,ans,freq);
				ds.remove(ds.size()-1);
				freq[i]=false;
			}
			
		}
		
	}

}
