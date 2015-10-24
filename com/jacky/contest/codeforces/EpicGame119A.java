package com.jacky.contest.codeforces;

/*
 * Simon and Antisimon play a game. Initially each player receives one fixed positive integer that doesn't change throughout the game. Simon receives number a and Antisimon receives number b. They also have a heap of n stones. The players take turns to make a move and Simon starts. During a move a player should take from the heap the number of stones equal to the greatest common divisor of the fixed number he has received and the number of stones left in the heap. A player loses when he cannot take the required number of stones (i. e. the heap has strictly less stones left than one needs to take).

 Your task is to determine by the given a, b and n who wins the game.
 Input

 The only string contains space-separated integers a, b and n (1 ≤ a, b, n ≤ 100) — the fixed numbers Simon and Antisimon have received correspondingly and the initial number of stones in the pile.
 Output

 If Simon wins, print "0" (without the quotes), otherwise print "1" (without the quotes).
 */
import java.util.Scanner;

public class EpicGame119A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int simon = input.nextInt();
		int antisimon = input.nextInt();
		int total = input.nextInt();

		while (total > 0) {
			int simonTake = gcd(simon, total);
			if (simonTake > total) {
				System.out.println(1);
				return;
			}
			total -= simonTake;
			int antisimonTake = gcd(antisimon, total);
			if (antisimonTake > total) {
				System.out.println(0);
				return;
			}
			total -= antisimonTake;
		}
		System.out.println(1); // once we get out of the loop without return,
								// that means simon loses!
	}

	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
