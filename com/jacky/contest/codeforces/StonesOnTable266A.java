package com.jacky.contest.codeforces;

/*
 * There are n stones on the table in a row, each of them can be red, green or blue. Count the minimum number of stones to take from the table so that any two neighboring stones had different colors. Stones in a row are considered neighboring if there are no other stones between them.
 Input

 The first line contains integer n (1 ≤ n ≤ 50) — the number of stones on the table.

 The next line contains string s, which represents the colors of the stones. We'll consider the stones in the row numbered from 1 to n from left to right. Then the i-th character s equals "R", if the i-th stone is red, "G", if it's green and "B", if it's blue.
 Output

 Print a single integer — the answer to the problem.
 */
import java.util.Scanner;

public class StonesOnTable266A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numStones = in.nextInt();
		in.nextLine();
		String colors = in.nextLine();
		int count = 0;
		char[] colorsChar = colors.toCharArray();
		for (int j = 1; j < colorsChar.length; j++) {
			if (colorsChar[j] == colorsChar[j - 1])
				count++;
			else
				continue;
		}
		System.out.println(count);
	}
}
