package com.take.u.forward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TUF_11_SubSetIgnoreDuplicate {
	public static void main(String[] args) {
		int a[] = {1,2,2,2,3,3};
		 List<List<Integer>> list = subSet(a);
		 System.out.println(list);
	}

	private static void findCombinations(int ind, int[] arr, 
			List<List<Integer>> ans, List<Integer> ds) {
   
        ans.add(new ArrayList<Integer>(ds));
        for(int i = ind; i < arr.length;i++) {
            if(i != ind && arr[i] == arr[i-1]) continue; 
            
            ds.add(arr[i]); 
            findCombinations(i+1, arr,  ans, ds); 
            ds.remove(ds.size() - 1); 
        }
    }
    public static List<List<Integer>> subSet(int[] candidates) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); 
        findCombinations(0, candidates,  ans, new ArrayList<>()); 
        return ans; 
    }

}
/*
 * [[], [1], [1, 2], [1, 2, 2], [1, 2, 2, 2], [1, 2, 2, 2, 3], [1, 2, 2, 2, 3,
 * 3], [1, 2, 2, 3], [1, 2, 2, 3, 3], [1, 2, 3], [1, 2, 3, 3], [1, 3], [1, 3,
 * 3], [2], [2, 2], [2, 2, 2], [2, 2, 2, 3], [2, 2, 2, 3, 3], [2, 2, 3], [2, 2,
 * 3, 3], [2, 3], [2, 3, 3], [3], [3, 3]]
 */