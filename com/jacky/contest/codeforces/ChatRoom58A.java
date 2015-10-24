package com.jacky.contest.codeforces;

/*
 * Vasya has recently learned to type and log on to the Internet. He immediately entered a chat room and decided to say hello to everybody. Vasya typed the word s. It is considered that Vasya managed to say hello if several letters can be deleted from the typed word so that it resulted in the word "hello". For example, if Vasya types the word "ahhellllloou", it will be considered that he said hello, and if he types "hlelo", it will be considered that Vasya got misunderstood and he didn't manage to say hello. Determine whether Vasya managed to say hello by the given word s.
 Input

 The first and only line contains the word s, which Vasya typed. This word consisits of small Latin letters, its length is no less that 1 and no more than 100 letters.
 Output

 If Vasya managed to say hello, print "YES", otherwise print "NO".
 */
import java.util.Scanner;

public class ChatRoom58A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.next();
		char[] lines = line.toCharArray();
		char[] hello = { 'h', 'e', 'l', 'l', 'o' };
		int completeHello = 0;
		int y = 0;
		for (int i = 0; i < lines.length; i++) {
			if (lines[i] == hello[y]) {
				y++;
				completeHello++;
			}
			if (completeHello == 5) {
				System.out.println("YES");
				return;
			}
		}
		if (completeHello != 5) {
			System.out.println("NO");
		}
	}

}
