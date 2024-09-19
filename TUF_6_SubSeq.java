package com.take.u.forward;

import java.util.ArrayList;
public class TUF_6_SubSeq {
	public static void main(String[] args) {
		int a[] = {3,1,2};
		findSubSequence(0,a,new ArrayList(),a.length-1);
	}
	private static void findSubSequence(int index,int[] a, ArrayList list, int length) {
		
		if(index>length) {
			System.out.println(list);
			return;
		}
		list.add(a[index]);
		findSubSequence(index+1,a,list,length);
		list.remove(list.size()-1);
		findSubSequence(index+1,a,list,length);
	}
}
/*
 * [3, 1, 2] [3, 1] [3, 2] [3] [1, 2] [1] [2] []
 */
