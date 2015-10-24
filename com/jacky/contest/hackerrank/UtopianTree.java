package com.jacky.contest.hackerrank;

/*
 * The Utopian tree goes through 2 cycles of growth every year. The first growth cycle occurs during the spring, when it doubles in height. The second growth cycle occurs during the summer, when its height increases by 1 meter.
 Now, a new Utopian tree sapling is planted at the onset of the spring. Its height is 1 meter. Can you find the height of the tree after N growth cycles?

 Input Format
 The first line contains an integer, T, the number of test cases.
 T lines follow. Each line contains an integer, N, that denotes the number of cycles for that test case.

 Constraints
 1 <= T <= 10
 0 <= N <= 60

 Output Format
 For each test case, print the height of the Utopian tree after N cycles. 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTestCases = in.nextInt();
		ArrayList<Integer> growthCircle = new ArrayList<Integer>();
		while (numTestCases > 0) {
			growthCircle.add(in.nextInt());
			numTestCases--;
		}

		for (int i = 0; i < growthCircle.size(); i++) {
			int height = 1;
			int value = growthCircle.get(i);
			for (int j = 0; j < value; j++) {
				if (j % 2 == 0) {
					height = height * 2;
				} else {
					height++;
				}
			}
			System.out.println(height);
		}
	}

}
