package com.first.test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SuZhu {
	public static void main(String[] args) {
		int[] a = { 1, 5, 4, 2, 2, 1, 3 };
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int[] b;
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer integer : set) {
			System.out.print(integer);
		}

	}
}
