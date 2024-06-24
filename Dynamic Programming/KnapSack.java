package DP;
//Java Program 0-1 Knapsack Problem 
//Write a Java program for a given N items where each item has some weight and profit associated with it and also given a bag with capacity W, [i.e., the bag can hold at most W weight in it]. The task is to put the items into the bag such that the sum of profits associated with them is the maximum possible. 
//
//Examples:
//
//Input: N = 3, W = 4, profit[] = {1, 2, 3}, weight[] = {4, 5, 1}
//Output: 3
//Explanation: There are two items which have weight less than or equal to 4. If we select the item with weight 4, the possible profit is 1. And if we select the item with weight 1, the possible profit is 3. So the maximum possible profit is 3. Note that we cannot put both the items with weight 4 and 1 together as the capacity of the bag is 4.
//
//Input: N = 3, W = 3, profit[] = {1, 2, 3}, weight[] = {4, 5, 6}
//Output: 0
public class KnapSack {
	public static void main(String args[]) {
		int w = 50;
		int profit[] = {60, 100, 120};
		int weight[] = {10, 20, 30};
		
		int n = profit.length;
		
		int res  = solveKnapsack(w,profit,weight,n);
		System.out.print(res);
		
	}
	
	public static int solveKnapsack(int W,int val[] ,int wt[],int n) {
		int dp[] = new int [W+1];
		
		for(int i=1;i<n+1;i++) {
			
			for(int w=W;w>=0;w--) {
				if(wt[i-1]<=w) {
					dp[w] = Math.max(dp[w], dp[w-wt[i-1]]+val[i-1]);
				}
			}
		}
		return dp[W];
	}

}
