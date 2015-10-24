package com.jacky.contest.codeforces;

import java.util.Scanner;

public class HQ9Plus133A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		if(s.contains("H") || s.contains("Q")  
				|| s.contains("9")){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
