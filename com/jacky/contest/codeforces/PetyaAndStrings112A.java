package com.jacky.contest.codeforces;

import java.util.Scanner;

public class PetyaAndStrings112A {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String firstString = in.nextLine();
		String secondString = in.nextLine();
		firstString = firstString.toLowerCase();
		secondString = secondString.toLowerCase();
		int diff = firstString.compareTo(secondString);
		
		
		if(diff < 0) {
			System.out.println("-1");
		}
		else if(diff == 0){
			System.out.println("0");
		}
		else {
			System.out.println("1");
		}
	}
}
