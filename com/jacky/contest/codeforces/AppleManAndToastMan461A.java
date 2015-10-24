package com.jacky.contest.codeforces;

/*
 * Appleman and Toastman play a game. Initially Appleman gives one group of n numbers to the Toastman, then they start to complete the following tasks:

 Each time Toastman gets a group of numbers, he sums up all the numbers and adds this sum to the score. Then he gives the group to the Appleman.
 Each time Appleman gets a group consisting of a single number, he throws this group out. Each time Appleman gets a group consisting of more than one number, he splits the group into two non-empty groups (he can do it in any way) and gives each of them to Toastman. 

 After guys complete all the tasks they look at the score value. What is the maximum possible value of score they can get?
 Input

 The first line contains a single integer n (1 ≤ n ≤ 3·105). The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 106) — the initial group that is given to Toastman.
 Output

 Print a single integer — the largest possible score.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AppleManAndToastMan461A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		ArrayList<Integer> values = new ArrayList<Integer>();
		while (num > 0) {
			num--;
			values.add(in.nextInt());
		}
		in.close();

		Collections.sort(values);
		long sum = 0;
		for (int i = 0; i < values.size(); i++) {
			sum += values.get(i);
		}

		long answer = sum;
		for (int i = 0; i < values.size() - 1; i++) {
			answer += sum;
			sum -= values.get(i);
		}
		System.out.println(answer);
	}

}
