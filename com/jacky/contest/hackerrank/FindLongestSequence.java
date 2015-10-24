package com.jacky.contest.hackerrank;
/*
 * find longest sequence of the same character
 */

public class FindLongestSequence {
	public static void main(String[] args) {
		int test = findLongestSubsequence("AAAA", 'A');
		System.out.println("case AAAA, sequence A, result: " + test);
		
		int test1 = findLongestSubsequence("AABB", 'A');
		System.out.println("case AABB, sequence A, result: " + test1);
		
		int test2 = findLongestSubsequence("ABAB", 'A');
		System.out.println("case ABAB, sequence A, result: " + test2);
		
		int test22 = findLongestSubsequence("ABAB", 'B');
		System.out.println("case ABAB, sequence B, result: " + test22);
		
		int test3 = findLongestSubsequence("BBBA", 'A');
		System.out.println("case BBBA, sequence A, result: " + test3);
		
		int test4 = findLongestSubsequence("BBBA", 'B');
		System.out.println("case BBBA, sequence B, result: " + test4);
		
		int test5 = findLongestSubsequence("BBBAAAAAA", 'B');
		System.out.println("case BBBAAAAAA, sequence B, result: " + test5);
		
		int test6 = findLongestSubsequence("BBBAAAAAA", 'A');
		System.out.println("case BBBAAAAAA, sequence A, result: " + test6);
		
		int test7 = findLongestSubsequence("BBBAABBBAAAAAA", 'A');
		System.out.println("case BBBAABBBAAAAAA, sequence A, result: " + test7);
		
		int test77 = findLongestSubsequence("BBBABBBAAAAAA", 'B');
		System.out.println("case BBBAAABBBAAAAAA, sequence B, result: " + test77);
	}
	
	public static int findLongestSubsequence(String s, char mychar) {
		int maxlen = 0;
		int len = 1;
		for(int i = 1; i < s.length(); i++){
			if(s.charAt(i) == mychar && s.charAt(i) == s.charAt(i-1)) {
				len++;
			} else{
				len = 1;
			}
			if(len > maxlen){
				maxlen = len;
			}
		}
		return maxlen;
	}
}
