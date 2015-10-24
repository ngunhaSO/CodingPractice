package com.jacky.contest.codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class FlippingGame327A {
	 public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int total = in.nextInt();
		ArrayList<Integer> values = new ArrayList<Integer>();
		while(total > 0){
			values.add(in.nextInt());
			total--;
		}
		
		ArrayList<Integer> valuesHelper = new ArrayList<Integer>();
		//for loop to count how many 1's are there in the list
		int count = 0;
		for(int i = 0; i < values.size(); i++){
			if(values.get(i) == 1){
				valuesHelper.add(-1);
				count++;
			}
			else {
				valuesHelper.add(1);
			}
		}
		//the rest of the task is to find the subsequence of maximal sum
		int max = -2;
		int sum = 0;
		for(int i = 0; i <valuesHelper.size(); i++){
			sum += valuesHelper.get(i);
			if(sum > max){
				max = sum;
			}
			if(sum < 0){
				sum = 0;
			}
		}
		System.out.println(max + count);
	}
}
