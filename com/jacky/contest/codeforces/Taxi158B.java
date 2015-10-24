package com.jacky.contest.codeforces;

/*
 * After the lessons n groups of schoolchildren went outside and decided to visit Polycarpus to celebrate his birthday. We know that the i-th group consists of si friends (1 ≤ si ≤ 4), and they want to go to Polycarpus together. They decided to get there by taxi. Each car can carry at most four passengers. What minimum number of cars will the children need if all members of each group should ride in the same taxi (but one taxi can take more than one group)?
 Input

 The first line contains integer n (1 ≤ n ≤ 105) — the number of groups of schoolchildren. The second line contains a sequence of integers s1, s2, ..., sn (1 ≤ si ≤ 4). The integers are separated by a space, si is the number of children in the i-th group.
 Output

 Print the single number — the minimum number of taxis necessary to drive all children to Polycarpus.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Taxi158B {
	public static int[] reverseSort(int[] groups) {
		int temp;
		for (int i = 0; i < groups.length / 2; ++i) {
			temp = groups[i];
			groups[i] = groups[groups.length - i - 1];
			groups[groups.length - i - 1] = temp;
		}
		return groups;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		in.nextLine();
		String line = in.nextLine();
		String[] lines = line.split("\\s+");
		int[] studentGroups = new int[lines.length];
		for (int i = 0; i < lines.length; i++) {
			studentGroups[i] = Integer.parseInt(lines[i]);
		}
		Arrays.sort(studentGroups);
		studentGroups = reverseSort(studentGroups);
		int taxi = 0;
		int children, childrenG, j;
		boolean added = false;
		int lastIndex = studentGroups.length - 1;
		int[] visited = new int[studentGroups.length];
		for (int i = 0; i < studentGroups.length; i++) {
			children = studentGroups[i]; //getting number of students at this position
			if(visited[i] != -1) {
				for(j = lastIndex; j >= i; j--){ //start checking from the end of the array, for possible of adding up to 4 students
					if(visited[j] != -1){
						childrenG = studentGroups[j]; //get student from the other end of array;
						if(children + childrenG > 4){ //if children from the left + children from right  exceed 4, we know that we need 1 taxi for each
							added = true; //set added to true, to signal that we add taxi
							taxi++; //raise taxi by 1
							break; //break out of inner loop for next outer iteration					
						}
						else if(children + childrenG == 4){ //if both end add up to 4, we need another taxi
							added = true;
							taxi ++;
							visited[j] = -1; //mark this as visited
							lastIndex = j; //change inner loop becase last element already visit
							break; //break out for next iteration
						}
						else { //not add
							children += childrenG;
							visited[j] = -1; //mark as visited
							lastIndex = j; //change end inner loop because last element already visit
						}
					}
					
				}
				if(!added) taxi++;
			}	
			visited[i] = -1;
		}
		System.out.println(taxi);
	}
}
