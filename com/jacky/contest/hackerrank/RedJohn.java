package com.jacky.contest.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class RedJohn {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalInputs = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < totalInputs; i++){
			list.add(in.nextInt());
		}
		
		for(int i = 0; i < list.size(); i++){
			int currentvalue = list.get(i);
			int[] mem = new int[41];
			mem[0] = mem[1] = mem[2] = mem[3] = 1; //base case
			for(int j = 4; j <= currentvalue; j++){
				mem[j] = mem[j-1] + mem[j - 4];
			}
			System.out.println(countPrime(mem[currentvalue]));
		}
	}
	
	private static boolean isPrime(int number) {
		if(number == 2) //2 is the oddest prime number
			return true;
		if(number % 2 ==0)
			return false;
		//only check for odd number
		for(int i = 3; i <= (int) Math.sqrt(number); i+=2){
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	private static int countPrime(int n){
		int count = 0;
		for(int i = 2; i <= n; i++){
			if(isPrime(i))
				count++;
		}
		return count;
	}

}
