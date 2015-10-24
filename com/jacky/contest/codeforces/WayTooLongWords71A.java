package com.jacky.contest.codeforces;

/*
 * Sometimes some words like "localization" or "internationalization" are so long that writing them many times in one text is quite tiresome.

 Let's consider a word too long, if its length is strictly more than 10 characters. All too long words should be replaced with a special abbreviation.

 This abbreviation is made like this: we write down the first and the last letter of a word and between them we write the number of letters between the first and the last letters. That number is in decimal system and doesn't contain any leading zeroes.

 Thus, "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

 You are suggested to automatize the process of changing the words with abbreviations. At that all too long words should be replaced by the abbreviation and the words that are not too long should not undergo any changes.
 Input

 The first line contains an integer n (1 ≤ n ≤ 100). Each of the following n lines contains one word. All the words consist of lowercase Latin letters and possess the lengths of from 1 to 100 characters.
 Output

 Print n lines. The i-th line should contain the result of replacing of the i-th word from the input data.
 */
import java.util.Scanner;

public class WayTooLongWords71A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfWords = in.nextInt();
		in.nextLine();// workaround to fix the line getting skipped
		String[] input = new String[numberOfWords];
		for (int i = 0; i < numberOfWords; i++) {
			input[i] = in.nextLine();
		}
		System.out.println("size: " + input.length);
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() <= 10) {
				System.out.println(input[i]);
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append(input[i].charAt(0));
				sb.append(input[i].substring(1, input[i].length() - 1).length());
				sb.append(input[i].charAt(input[i].length() - 1));
				System.out.println(sb.toString());
			}
		}

	}
}
