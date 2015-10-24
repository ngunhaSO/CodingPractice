package com.jacky.contest.codeforces;

/*
 * "Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.

 A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.
 Input

 The first line of the input contains two integers n and k (1 ≤ k ≤ n ≤ 50) separated by a single space.

 The second line contains n space-separated integers a1, a2, ..., an (0 ≤ ai ≤ 100), where ai is the score earned by the participant who got the i-th place. The given sequence is non-increasing (that is, for all i from 1 to n - 1 the following condition is fulfilled: ai ≥ ai + 1).
 Output

 Output the number of participants who advance to the next round.
 */
import java.util.Scanner;

public class NextRound158A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line1 = in.nextLine();
		String line2 = in.nextLine();

		String[] sline1 = line1.split(" ");
		String[] sline2 = line2.split(" ");

		int condition = Integer.parseInt(sline1[1]);

		if (condition - 1 >= sline2.length) {
			System.out.println(sline2.length);
			System.exit(0);
		}

		int count = 0;
		for (int i = 0; i < sline2.length; i++) {
			if (Integer.parseInt(sline2[i]) == 0) {
				continue;
			} else if (Integer.parseInt(sline2[i]) >= Integer
					.parseInt(sline2[condition - 1])) {
				count++;
			}
		}

		System.out.println(count);
		in.close();
	}
}
