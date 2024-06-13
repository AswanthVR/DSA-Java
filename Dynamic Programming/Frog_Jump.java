//Problem Statement:

//Given a number of stairs and a frog, the frog wants to climb from the 0th stair to the (N-1)th stair.
//At a time the frog can climb either one or two steps. 
//A height[N] array is also given. Whenever the frog jumps from a stair i to stair j, 
//the energy consumed in the jump is abs(height[i]- height[j]), where abs() means the absolute difference. 
//We need to return the minimum energy that can be used by the frog to jump from stair 0 to stair N-1.

package DP;

public class Frog_Jump {
	public static void main(String args[]) {
		int n = 4;
		int height[] = {10,20,30,10};
		
		System.out.println(find_min_energy(height,n));
	}
	
	public static int find_min_energy(int height[] , int n) {
		int dp[] = new int[n];
		dp[0] = 0;
		
		for(int i=1;i<n;i++) {
			int fs = dp[i-1]+Math.abs(height[i] - height[i-1]);
			int ss = Integer.MAX_VALUE;
			
			if(i>1)
			ss = dp[i-2]+Math.abs(height[i] - height[i-2]);
			
			dp[i] = Math.min(fs, ss);
		}
		return dp[n-1];
	}
}
