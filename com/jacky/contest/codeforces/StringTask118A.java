package com.jacky.contest.codeforces;

/*
 * Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

 deletes all the vowels,
 inserts a character "." before each consonant,
 replaces all uppercase consonants with corresponding lowercase ones. 

 Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.

 Help Petya cope with this easy task.
 Input

 The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.
 Output

 Print the resulting string. It is guaranteed that this string is not empty.
 */
import java.util.Scanner;

public class StringTask118A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.next();
		line = line.toLowerCase();
		char[] vowels = { 'a', 'o', 'y', 'e', 'u', 'i' };
		char[] lineArray = line.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lineArray.length; i++) {
			if (lineArray[i] == vowels[0] || lineArray[i] == vowels[1]
					|| lineArray[i] == vowels[2] || lineArray[i] == vowels[3]
					|| lineArray[i] == vowels[4] || lineArray[i] == vowels[5]) {
			} else {
				sb.append("." + lineArray[i]);
			}
		}

		System.out.println(sb.toString());
	}
}
