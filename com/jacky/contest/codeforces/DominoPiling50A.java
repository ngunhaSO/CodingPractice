package com.jacky.contest.codeforces;

/*
 * You are given a rectangular board of M × N squares. Also you are given an unlimited number of standard domino pieces of 2 × 1 squares. You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:

 1. Each domino completely covers two squares.

 2. No two dominoes overlap.

 3. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.

 Find the maximum number of dominoes, which can be placed under these restrictions.
 Input

 In a single line you are given two integers M and N — board sizes in squares (1 ≤ M ≤ N ≤ 16).
 Output

 Output one number — the maximal number of dominoes, which can be placed.
 */
import java.util.Scanner;
public class DominoPiling50A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] lines = line.split("\\s+");
		int[] domino = new int[lines.length];
		for(int i = 0; i < lines.length; i++){
			domino[i] = Integer.parseInt(lines[i]);
		}
		int m = domino[0];
		int n = domino[1];
		int pieces = (m * n)/2;	
		System.out.println(pieces);
	}
}
