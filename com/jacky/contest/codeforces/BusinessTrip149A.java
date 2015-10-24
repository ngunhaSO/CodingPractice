package com.jacky.contest.codeforces;

/*
 * What joy! Petya's parents went on a business trip for the whole year and the playful kid is left all by himself. Petya got absolutely happy. He jumped on the bed and threw pillows all day long, until...

 Today Petya opened the cupboard and found a scary note there. His parents had left him with duties: he should water their favourite flower all year, each day, in the morning, in the afternoon and in the evening. "Wait a second!" — thought Petya. He know for a fact that if he fulfills the parents' task in the i-th (1 ≤ i ≤ 12) month of the year, then the flower will grow by ai centimeters, and if he doesn't water the flower in the i-th month, then the flower won't grow this month. Petya also knows that try as he might, his parents won't believe that he has been watering the flower if it grows strictly less than by k centimeters.

 Help Petya choose the minimum number of months when he will water the flower, given that the flower should grow no less than by k centimeters.
 Input

 The first line contains exactly one integer k (0 ≤ k ≤ 100). The next line contains twelve space-separated integers: the i-th (1 ≤ i ≤ 12) number in the line represents ai (0 ≤ ai ≤ 100).
 Output

 Print the only integer — the minimum number of months when Petya has to water the flower so that the flower grows no less than by k centimeters. If the flower can't grow by k centimeters in a year, print -1.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BusinessTrip149A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int growth = in.nextInt();
		ArrayList<Integer> monthGrowth = new ArrayList<Integer>();
		for (int i = 0; i < 12; i++) {
			monthGrowth.add(in.nextInt());
		}
		in.close();
		Collections.sort(monthGrowth);
		if (growth == 0) {
			System.out.println(0);
			return;
		}
		int height = 0;
		for (int i = monthGrowth.size() - 1; i >= 0; i--) {
			height += monthGrowth.get(i);
			if (height >= growth) {
				System.out.println(monthGrowth.size() - i);
				break;
			}
		}
		if (height < growth) {
			System.out.println(-1);
		}
	}
}
