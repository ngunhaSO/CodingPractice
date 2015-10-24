package com.jacky.contest.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTests = in.nextInt();
		
		for(int i = 0; i < numTests; i++){
			int numBricks = in.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j = 0; j < numBricks; j++){
				list.add(in.nextInt());
			}
			//logic goes here to determine
			int maxPoints = 0;
			for(int j = 0; j <list.size() - 3; j = j + 2){
				if(list.get(j) == 0) {
					j = j - 1;
				}
				else maxPoints += list.get(j) + list.get(j+1) + list.get(j + 2);
			} 
			System.out.println(maxPoints);
			
		}
	}
}
