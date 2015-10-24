package com.jacky.contest.topcoder;

import java.util.StringTokenizer;

/*
 * You work for a very large company that markets many different products. In some cases, one product you market competes with another. To help deal with this situation you have split the intended consumers into two groups, namely Adults and Teenagers. If your company markets 2 products that compete with each other, selling one to Adults and the other to Teenagers will help maximize profits. Given a list of the products that compete with each other, you are going to determine whether all can be marketed such that no pair of competing products are both sold to Teenagers or both sold to Adults. If such an arrangement is not feasible your method will return -1. Otherwise, it should return the number of possible ways of marketing all of the products.



 The products will be given in a String[] compete whose kth element describes product k. The kth element will be a single-space delimited list of integers. These integers will refer to the products that the kth product competes with. For example:

 compete = {"1 4",
 "2",
 "3",
 "0",
 ""}

 The example above shows product 0 competes with 1 and 4, product 1 competes with 2, product 2 competes with 3, and product 3 competes with 0. Note, competition is symmetric so product 1 competing with product 2 means product 2 competes with product 1 as well.

 Ways to market:

 1) 0 to Teenagers, 1 to Adults, 2 to Teenagers, 3 to Adults, and 4 to Adults

 2) 0 to Adults, 1 to Teenagers, 2 to Adults, 3 to Teenagers, and 4 to Teenagers

 Your method would return 2. 
 */


public class Marketing {
	
	boolean adj[][] = new boolean[64][64];
	int color[] = new int[64];
	int n;
	boolean oddcycle = false;
	
	public long howMany(String[] compete) {
		n = compete.length;
		for(int i = 0; i < compete.length; i++){
			StringTokenizer st = new StringTokenizer(compete[i], " "); //split each element in array by white space
			while(st.hasMoreTokens()){
				int j = Integer.parseInt(st.nextToken());
				adj[i][j] = adj[j][i] = true;
			}
		}
		for(int i =0; i < n; i++){
			color[i] = 0;
		}
		
		int ncomp = 0;
		//count components
		for(int i = 0; i < n; i++){
			if(color[i] == 0){
				ncomp++;
				dfs(i,1);
			}
		}
		if(oddcycle){
			return -1;
		}
		
		long res = 1;
		while(ncomp -- > 0){
			res *= 2;
		}
		return res;
	}

	private void dfs(int u, int c) {
		if(color[u] != 0){
			if(color[u] != c) //if the color of the child is the same as parent, mark odd
				oddcycle = true; 
			return;
		}
		
		color[u] = c; //mark current node as visited and assign color
		for(int v = 0; v < n; v++){
			if(adj[u][v]){ //if true then recursively call the dfs and assign new color
				dfs(v, 3-c);
			}
		}
	}
	
	public static void main(String[] args) {
		Marketing m = new Marketing();
		String[] compete = {"1 4","2","3","0",""};
		String[] compete1 = {"1","2","0"};
		String[] compete2 = {"1","2","3","0","0 5","1"};
		String [] compete3 = {" "," "," "," "," "," "," "," "," "," ",
				 " "," "," "," "," "," "," "," "," "," ",
				 " "," "," "," "," "," "," "," "," "," "};
		String[] compete4 = {"1","2","3","0","5","6","4"};
		
		System.out.println("test 0: "  + m.howMany(compete));
		System.out.println("test 1: "  + m.howMany(compete1));
		System.out.println("test 2: "  + m.howMany(compete2));
		System.out.println("test 3: "  + m.howMany(compete3));
		System.out.println("test 4: "  + m.howMany(compete4));
	}
}

/*
 * Examples
 0)	


 {"1 4","2","3","0",""}

 Returns: 2

 The example from above.
 1)	


 {"1","2","0"}

 Returns: -1

 Product 0 cannot be marketed with product 1 or 2. Product 1 cannot be marketed with product 2. There is no way to achieve a viable marketing scheme.
 2)	


 {"1","2","3","0","0 5","1"}

 Returns: 2

 3)	


 {"","","","","","","","","","",
 "","","","","","","","","","",
 "","","","","","","","","",""}

 Returns: 1073741824

 4)	


 {"1","2","3","0","5","6","4"}

 Returns: -1
 */