package com.jacky.contest.topcoder;

public class Bonues {
	
	public int[] getDivision(int[] points) {
		int totalPoints = sumArray(points);
		int remainder = 100;
		int[] award = new int[points.length];
		for(int i =0; i < points.length; i++){		
			award[i] = points[i] * 100 / totalPoints;
			remainder -= award[i];
		}
		while(remainder > 0){
			int index = 0;
			int max = 0;
			for(int i = 0; i < points.length; i++){
				if(points[i] > max){
					max = points[i];
					index = i;
				}
			}
			award[index]++;
			points[index] = 0;
			remainder--;
		}
		return award;
	}
	
	private int sumArray(int[] points){
		if(points.length == 0){
			return 0;
		}
		int n = points.length - 1;
		int value = points[n];
		int[] pointsCopy = new int[n];
		System.arraycopy(points, 0, pointsCopy, 0, n);
		return  value + sumArray(pointsCopy);
	}
	
	public static void main(String[] args) {
		Bonues b = new Bonues();
		int[] ex1 = {485, 324, 263, 143, 470, 292, 304, 188, 100, 254, 296,
				 255, 360, 231, 311, 275,  93, 463, 115, 366, 197, 470};
		int[] result  = b.getDivision(ex1);
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i] + " ");
		}
	}
}

