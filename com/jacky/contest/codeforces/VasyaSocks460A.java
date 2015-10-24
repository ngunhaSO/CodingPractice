package com.jacky.contest.codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VasyaSocks460A {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int current = Integer.parseInt(st.nextToken());
		int mDays = Integer.parseInt(st.nextToken());
		int newSocks = mDays;
		while(newSocks <= current){
			newSocks += mDays;
			current++;
		}
		System.out.println(current );
	}
}
