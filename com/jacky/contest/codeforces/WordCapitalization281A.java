package com.jacky.contest.codeforces;

import java.util.Scanner;

public class WordCapitalization281A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		
		System.out.println(Character.toUpperCase(word.charAt(0)) + word.substring(1));
	}

}
