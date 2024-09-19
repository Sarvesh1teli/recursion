package com.take.u.forward;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TUF_10_SubSetSum {
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(3,1,2);
		List<Integer> list = subSetSum(l);
		System.out.println(list);
	}
	 public static List<Integer> subSetSum(List<Integer> list) {
		 List<Integer> subSet = new ArrayList<Integer>();
	     subSetSumResult(0,list,subSet,0); 
	     Collections.sort(subSet);
	     return subSet;
	    }
	
	 private static void subSetSumResult(int ind,List<Integer> list, List<Integer> subSet,int sum) {
		 
		 if(ind > list.size()-1) {
			 subSet.add(sum);
			 return;
		 }
		 subSetSumResult(ind+1,list,subSet,sum+list.get(ind));
		 subSetSumResult(ind+1,list,subSet,sum);
	}

}
//[0, 1, 2, 3, 3, 4, 5, 6]