package com.jacky.contest.codeforces;

/*
 * Linear Kingdom has exactly one tram line. It has n stops, numbered from 1 to n in the order of tram's movement. At the i-th stop ai passengers exit the tram, while bi passengers enter it. The tram is empty before it arrives at the first stop. Also, when the tram arrives at the last stop, all passengers exit so that it becomes empty.

 Your task is to calculate the tram's minimum capacity such that the number of people inside the tram at any time never exceeds this capacity. Note that at each stop all exiting passengers exit before any entering passenger enters the tram.
 Input

 The first line contains a single number n (2 ≤ n ≤ 1000) — the number of the tram's stops.

 Then n lines follow, each contains two integers ai and bi (0 ≤ ai, bi ≤ 1000) — the number of passengers that exits the tram at the i-th stop, and the number of passengers that enter the tram at the i-th stop. The stops are given from the first to the last stop in the order of tram's movement.

 The number of people who exit at a given stop does not exceed the total number of people in the tram immediately before it arrives at the stop. More formally, . This particularly means that a1 = 0.
 At the last stop, all the passengers exit the tram and it becomes empty. More formally, .
 No passenger will enter the train at the last stop. That is, bn = 0. 

 Output

 Print a single integer denoting the minimum possible capacity of the tram (0 is allowed).
 */
import java.util.Scanner;

public class Tram116A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numStops = in.nextInt();
		int a, b;
		int total = 0;
		int largest = 0;
		while (numStops > 0) {
			numStops--;
			a = in.nextInt();
			b = in.nextInt();
			total = total - a;
			total = total + b;
			if (total > largest)
				largest = total;
		}
		System.out.println(largest);
	}
}
