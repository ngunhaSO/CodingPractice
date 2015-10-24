package com.jacky.contest.codeforces;


/*
 * Imagine that you have a twin brother or sister. Having another person that looks exactly like you seems very unusual. It's hard to say if having something of an alter ego is good or bad. And if you do have a twin, then you very well know what it's like.

 Now let's imagine a typical morning in your family. You haven't woken up yet, and Mom is already going to work. She has been so hasty that she has nearly forgotten to leave the two of her darling children some money to buy lunches in the school cafeteria. She fished in the purse and found some number of coins, or to be exact, n coins of arbitrary values a1, a2, ..., an. But as Mom was running out of time, she didn't split the coins for you two. So she scribbled a note asking you to split the money equally.

 As you woke up, you found Mom's coins and read her note. "But why split the money equally?" — you thought. After all, your twin is sleeping and he won't know anything. So you decided to act like that: pick for yourself some subset of coins so that the sum of values of your coins is strictly larger than the sum of values of the remaining coins that your twin will have. However, you correctly thought that if you take too many coins, the twin will suspect the deception. So, you've decided to stick to the following strategy to avoid suspicions: you take the minimum number of coins, whose sum of values is strictly more than the sum of values of the remaining coins. On this basis, determine what minimum number of coins you need to take to divide them in the described manner.
 Input

 The first line contains integer n (1 ≤ n ≤ 100) — the number of coins. The second line contains a sequence of n integers a1, a2, ..., an (1 ≤ ai ≤ 100) — the coins' values. All numbers are separated with spaces.
 Output

 In the single line print the single number — the minimum needed number of coins.

 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class Twins160A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numCoins = in.nextInt();
		int coinSum = 0;
		int restCoinSum = 0;
		ArrayList<Integer> values = new ArrayList<Integer>();
		for (int i = 0; i < numCoins; i++) {
			values.add(in.nextInt());
			restCoinSum += values.get(values.size() - 1); //total value of coins
		}
		in.close();
		Collections.sort(values);
		for(int i = values.size() - 1; i >= 0; i--){
			coinSum += values.get(i); //first twin pick the first coin
			restCoinSum -= values.get(i); //reduce the size of the total because first twin picked it
			if(coinSum > restCoinSum){ //if coinsum > rest value, return the size - index
				System.out.println(values.size() - i);
				break;
			}
		}
	}
}
