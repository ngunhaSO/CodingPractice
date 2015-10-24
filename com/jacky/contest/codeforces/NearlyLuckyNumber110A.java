package com.jacky.contest.codeforces;

import java.util.Scanner;

public class NearlyLuckyNumber110A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numString = input.nextLine();
		char[] charnums = numString.toCharArray();
		int count = 0;
		for(int i = 0; i < charnums.length; i++){
			if(charnums[i] == '4' || charnums[i] == '7'){
				count++;
			}
		}
		if(count == 0){
			System.out.println("NO");
			return;
		}
		if(count == 7 || count  == 4){
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		
	}
}
