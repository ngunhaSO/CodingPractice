package com.jacky.contest.codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths339A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String summands = in.nextLine();
		String[] digitsString = summands.split("\\+");
		int[] digits = new int[digitsString.length];
		for(int i = 0; i < digitsString.length; i++){
			digits[i] = Integer.parseInt(digitsString[i]);
		}
		Arrays.sort(digits);
		for(int i = 0;i < digits.length; i++){
			System.out.print(digits[i]);
			if(i < digits.length - 1)
				System.out.print("+");
		}
	}
}
