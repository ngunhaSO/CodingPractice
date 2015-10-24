package com.jacky.contest.codeforces;

/*
 * «One dragon. Two dragon. Three dragon», — the princess was counting. She had trouble falling asleep, and she got bored of counting lambs when she was nine.

 However, just counting dragons was boring as well, so she entertained herself at best she could. Tonight she imagined that all dragons were here to steal her, and she was fighting them off. Every k-th dragon got punched in the face with a frying pan. Every l-th dragon got his tail shut into the balcony door. Every m-th dragon got his paws trampled with sharp heels. Finally, she threatened every n-th dragon to call her mom, and he withdrew in panic.

 How many imaginary dragons suffered moral or physical damage tonight, if the princess counted a total of d dragons?
 Input

 Input data contains integer numbers k, l, m, n and d, each number in a separate line (1 ≤ k, l, m, n ≤ 10, 1 ≤ d ≤ 105).
 Output

 Output the number of damaged dragons.
 */
import java.util.Scanner;

public class InsomniaCure148A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int punch = in.nextInt();
		int shut = in.nextInt();
		int trample = in.nextInt();
		int threaten = in.nextInt();
		int total = in.nextInt();
		int count = 0;
		for (int i = 1; i <= total; i++) {
			if (i % punch != 0 && i % shut != 0 && i % trample != 0
					&& i % threaten != 0)
				count++;
		}
		System.out.println(total - count);
	}

}
