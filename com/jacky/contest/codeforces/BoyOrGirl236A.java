package com.jacky.contest.codeforces;

import java.util.Hashtable;
import java.util.Scanner;

public class BoyOrGirl236A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] characters = in.nextLine().toCharArray();
		Hashtable<Character, Integer> dist = new Hashtable<Character, Integer>();
		for(int i = 0; i < characters.length; i++){
			if(!dist.containsKey(characters[i])){
				dist.put(characters[i], 1);
			}
			else {
				int val = dist.get(characters[i]);
				dist.put(characters[i], val++);
			}
		}
		int count = 0;
		for(Character c : dist.keySet()){
			if(dist.get(c) == 1){
				count++;
			}
		}
		if(count % 2 == 0){
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
	}
}
