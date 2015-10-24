package com.jacky.contest.codeforces;

import java.util.Hashtable;
import java.util.Scanner;

public class BeautifulYear271A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		i = i + 1;
		while(i <= Integer.MAX_VALUE){
			if(isDistinct(i)){
				System.out.println(i);
				return;
			}
			else {
				i++;
			}
		}
	}
	
	private static boolean isDistinct(int num){
		String numstring = String.valueOf(num);
		Hashtable<Character,Integer> hash = new Hashtable<Character, Integer>();		
		for(int i = 0; i < numstring.length(); i++){
			if(!hash.containsKey(numstring.charAt(i))) {
				hash.put(numstring.charAt(i), 1);
			}
			else {
				return false;
			}
		}
		return true;
	}
}
