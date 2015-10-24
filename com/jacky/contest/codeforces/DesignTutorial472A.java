package com.jacky.contest.codeforces;

import java.util.Scanner;

public class DesignTutorial472A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		int first = 4;
		while(true){
			if(isPrime(input - first)){
				first += 2;
			}
			else {
				System.out.println(first + " " + (input - first));
				break;
			}
		}
	}
	
	private static boolean isPrime(int n){
		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i != 0)
				continue;
			else
				return false;
		}
		return true;
	}
}
