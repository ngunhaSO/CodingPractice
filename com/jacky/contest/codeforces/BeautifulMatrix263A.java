package com.jacky.contest.codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//If the single 1 is located on the intersection of the r-th row and the c-th column (1-based numeration), 
//then the answer is |3 - r| + |3 - c|.
public class BeautifulMatrix263A {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean found = false;
		int i = 1, j = 1;
		StringTokenizer st = null;
		for (; i <= 5 && !found; i++) {
			st = new StringTokenizer(br.readLine());
			for (j = 1; j <= 5 && !found; j++) {
				String num = st.nextToken();
				if (num.charAt(0) == '1') {
					found = true;
					break;
				}
			}
		}

		System.out.println(Math.abs(3 - i + 1) + Math.abs(3 - j) );

		br.close();
	}
}
