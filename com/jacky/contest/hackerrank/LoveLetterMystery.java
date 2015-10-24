package com.jacky.contest.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class LoveLetterMystery {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<String>();
		int testCases = input.nextInt();
		input.nextLine();
		for (int i = 0; i < testCases; i++) {
			inputs.add(input.nextLine());
		}
		for (int i = 0; i < inputs.size(); i++) {
			String s = inputs.get(i);
			int low = 0;
			int high = s.length() - 1;
			int count = 0;
			while (low < high) {
				if (s.charAt(low) != s.charAt(high)) {
					int temp = Math.abs(s.charAt(low) - s.charAt(high));
					count += temp;
				}
				low++;
				high--;
				
			}
			System.out.println(count);
		}
		input.close();
	}

}
