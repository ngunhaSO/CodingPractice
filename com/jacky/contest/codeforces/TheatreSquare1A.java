package com.jacky.contest.codeforces;

import java.util.Scanner;

/*
 * Theatre Square in the capital city of Berland has a rectangular shape with the size n × m meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a × a.

 What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.
 Input

 The input contains three positive integer numbers in the first line: n,  m and a (1 ≤  n, m, a ≤ 109).
 Output

 Write the needed number of flagstones.

NOTE: tricky here, expect the input to be super large, so convert to long
 */
public class TheatreSquare1A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, m, a;
		double nn, mm;
		n = in.nextInt();
		m = in.nextInt();
		a = in.nextInt();

		nn = (double) n / a;
		mm = (double) m / a;
		nn = nn > 1 ? Math.ceil(nn) : 1;
		mm = mm > 1 ? Math.ceil(mm) : 1;
		System.out.println((long) nn * (long) mm);
	}
}
