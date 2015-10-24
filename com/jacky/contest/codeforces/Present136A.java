package com.jacky.contest.codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Present136A {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] gifts = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		//transform 2 1 3 to 1 2 3
		for (int i = 0; i < n; i++) {
			int gift = Integer.parseInt(st.nextToken());
			gifts[gift - 1] = i + 1;
		}

		String out = Arrays.toString(gifts);
		out = out.substring(1, out.length() - 1); //remove square bracket
		System.out.println(out);
		out = out.replaceAll(",", "");
		System.out.println(out);
		br.close();
	}
	
	/*public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int invites = in.nextInt();		
	List<Integer> giverList = new ArrayList<Integer>();
	for(int i= 0;i < invites;i++)
	{
		int giver = in.nextInt();
		giverList.add(giver);
	}
	Map<Integer, Integer> receiverList = new HashMap<Integer, Integer>();
	for(int i = 0; i < giverList.size(); i++){
		receiverList.put(giverList.get(i), giverList.indexOf(giverList.get(i)) + 1);
	}

	for (Map.Entry<Integer, Integer> entry : receiverList.entrySet()) {
	  int value = entry.getValue();
	  System.out.print(value  + " ");
	}
	in.close();
	}*/
}
