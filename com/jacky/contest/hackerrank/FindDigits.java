package com.jacky.contest.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class FindDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		ArrayList<String> list = new ArrayList<String>();
		while(num > 0){
			list.add(String.valueOf(in.nextInt()));
			num--;
		}
		
		for(int i = 0; i < list.size(); i++){
			String val = list.get(i);
			int count = 0;
			for(int j = 0; j < val.length(); j++){
				int a = Character.getNumericValue(val.charAt(j));
				if(a == 0) continue;
				if(Integer.valueOf(val) % a == 0) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
}
