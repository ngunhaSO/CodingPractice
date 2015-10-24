package com.jacky.contest.codeforces;

import java.util.Scanner;

public class DoubleCola82A {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		String[] friends = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
		int index  =0;
		int db = 1;
		while(times >= 1){
			index = 0;
			for(int i = 0; i < friends.length; i++){
				times -= db;
				if(times <= 0) break;
				index++;
			}
			db *= 2;
		}
		System.out.println(friends[index]);
		
	}
}
