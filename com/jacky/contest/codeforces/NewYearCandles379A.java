package com.jacky.contest.codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NewYearCandles379A {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int current = Integer.parseInt(st.nextToken());
		int reusedNeeded = Integer.parseInt(st.nextToken());
		int total = current;
		while(current >= reusedNeeded){
			int div = current / reusedNeeded;
			total = total + div;
			int mod = current % reusedNeeded;
			current = div + mod;
		}
		
		//method 2 --- less intuitive
		/*int current = Integer.parseInt(st.nextToken());
		int reusedNeeded = Integer.parseInt(st.nextToken());
		int newCandle = reusedNeeded;
		while(newCandle <= current){
			newCandle += reusedNeeded;
			current++;
		}*/
		
		System.out.println(current);

	}
}
