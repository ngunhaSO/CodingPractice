package com.jacky.contest.hackerrank;

/*
 * Count pairs problem that is part of an interview that I refuse to tell the name of the company
 */
public class P {

	static int countPairs(int[] a, int len, int diff) {
		int temp;
		int count = 0;
		for (int i = 0; i < len; i++) {
			temp = a[i];
			for (int j = i + 1; j < len; j++) {
				if (temp + diff  == a[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 5 };
		int val = countPairs(array, array.length, 4);
		System.out.println(val);
	}
}
