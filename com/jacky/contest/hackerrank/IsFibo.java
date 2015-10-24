package com.jacky.contest.hackerrank;

/*
 * You are given an integer, N. Write a program to determine if N is an element of the Fibonacci Sequence.

 The first few elements of fibonacci sequence are 0,1,1,2,3,5,8,13.... A fibonacci sequence is one where every element is a sum of the previous two elements in the sequence. The first two elements are 0 and 1.

 Formally:

 fib0 = 0
 fib1 = 1
 fibn = fibn-1 + fibn-2 ∀ n > 1

 Input Format
 The first line contains T, number of test cases.
 T lines follows. Each line contains an integer N.

 Output Format
 Display IsFibo if N is a fibonacci number and IsNotFibo if it is not a fibonacci number. The output for each test case should be displayed on a new line.

 Constraints
 1 <= T <= 105
 1 <= N <= 1010

*NOTE: this one got me at the length of generate fibonacci list, it has to be 10^10 exactly
 */
import java.util.ArrayList;
import java.util.Scanner;

public class IsFibo {
	public static void main(String[] args) {
		ArrayList<Long> list = new ArrayList<Long>();
		list = generateFibo(10000000000L);

		Scanner in = new Scanner(System.in);
		long num = in.nextLong();
		ArrayList<Long> values = new ArrayList<Long>();
		for (int i = 0; i < num; i++) {
			long testFib = in.nextLong();
			values.add(testFib);
		}
		for (int i = 0; i < values.size(); i++) {
			long testFib = values.get(i);
			if (list.indexOf(testFib) != -1) {
				System.out.println("IsFibo");
			} else {
				System.out.println("IsNotFibo");
			}
		}
	}

	public static ArrayList<Long> generateFibo(long n) {
		ArrayList<Long> list = new ArrayList<Long>();

		long fib0 = 0;
		long fib1 = 1;
		long fibn = fib0 + fib1;
		list.add(fib0);
		list.add(fib1);
		list.add(fibn);
		while (fibn <= n) {
			fib0 = fib1;
			fib1 = fibn;
			fibn = fib0 + fib1;
			list.add(fibn);
		}

		return list;

	}
}
