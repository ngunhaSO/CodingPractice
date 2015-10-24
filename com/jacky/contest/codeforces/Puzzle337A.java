package com.jacky.contest.codeforces;

/*
 * The end of the school year is near and Ms. Manana, the teacher, will soon have to say goodbye to a yet another class. She decided to prepare a goodbye present for her n students and give each of them a jigsaw puzzle (which, as wikipedia states, is a tiling puzzle that requires the assembly of numerous small, often oddly shaped, interlocking and tessellating pieces).

 The shop assistant told the teacher that there are m puzzles in the shop, but they might differ in difficulty and size. Specifically, the first jigsaw puzzle consists of f1 pieces, the second one consists of f2 pieces and so on.

 Ms. Manana doesn't want to upset the children, so she decided that the difference between the numbers of pieces in her presents must be as small as possible. Let A be the number of pieces in the largest puzzle that the teacher buys and B be the number of pieces in the smallest such puzzle. She wants to choose such n puzzles that A - B is minimum possible. Help the teacher and find the least possible value of A - B.
 Input

 The first line contains space-separated integers n and m (2 ≤ n ≤ m ≤ 50). The second line contains m space-separated integers f1, f2, ..., fm (4 ≤ fi ≤ 1000) — the quantities of pieces in the puzzles sold in the shop.
 Output

 Print a single integer — the least possible difference the teacher can obtain.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Puzzle337A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line1 = in.nextLine();
		String[] lines1 = line1.split(" ");
		int[] first = new int[lines1.length];
		for (int i = 0; i < lines1.length; i++) {
			first[i] = Integer.parseInt(lines1[i]);
		}
		ArrayList<Integer> pieces = new ArrayList<Integer>();
		for (int i = 0; i < first[1]; i++) {
			pieces.add(in.nextInt());
		}
		Collections.sort(pieces);
		int smallest = pieces.get(pieces.size() - 1);
		for (int i = 0; i <= pieces.size() - first[0]; i++) {
			int low = pieces.get(i);
			int high = pieces.get(i + first[0] - 1);
			int difference = high - low;
			if (difference < smallest) {
				smallest = difference;
			}
		}
		System.out.println(smallest);
	}
}
