package com.jacky.contest.hackerrank;

/*
 * Shashank likes strings in which consecutive characters are different. For example, he likes ABABA, while he doesn't like ABAA. Given a string containing characters A and B only, he wants to change it into a string he likes. To do this, he is allowed to delete the characters in the string.

 Your task is to find the minimum number of required deletions.

 Input Format
 The first line contains an integer T i.e. the number of test cases.
 Next T lines contain a string each.

 Output Format
 Print minimum number of required steps for each test case.

 Constraints

 1≤T≤10
 1≤lengthofString≤105 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTest = in.nextInt();
		in.nextLine();
		ArrayList<String> list = new ArrayList<String>();
		while (numTest > 0) {
			numTest--;
			list.add(in.nextLine());
		}
		in.close();
		for (int i = 0; i < list.size(); i++) {
			int answer = 0;
			String s = list.get(i);
			for (int j = 0; j < s.length() - 1; j++) {
				if (s.charAt(j) == s.charAt(j + 1)) {
					answer++;
				}
			}
			System.out.println(answer);
		}
	}

}
