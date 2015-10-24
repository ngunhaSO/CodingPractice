package com.jacky.contest.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AngryChildren {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int packages = in.nextInt();
		int kids = in.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < packages; i++){
			array.add(in.nextInt());
		}
		Collections.sort(array);
		
		if(kids == 1){
			System.out.println(0);
		}
		else if(kids == packages){
			System.out.println(array.get(array.size() - 1) - array.get(0));
		}
		else {
			int diff = array.get(array.size() - 1);
			for(int i = 0 ; i < array.size() - kids + 1; i++){
				if((array.get(i+kids-1) - array.get(i)) < diff) {
					diff = array.get(i + kids - 1) - array.get(i);
				}
			}
			System.out.println(diff);
		}


	}

}
