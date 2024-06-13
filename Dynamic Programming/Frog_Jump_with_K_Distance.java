//https://takeuforward.org/data-structure/dynamic-programming-frog-jump-with-k-distances-dp-4/
package DP;
import java.util.*;
public class Frog_Jump_with_K_Distance {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = {30, 10, 60, 10, 60, 50};
		int n = 6;
		int k = 4;
		int res = frogJump(a,n,k);
		System.out.println(res);
	}
	
	public static int frogJump(int a[] , int n, int k) {
		
		int dp[] = new int [n];
		dp[0] = 0;
		
		for(int i=1;i<n;i++) {
			int minJump = Integer.MAX_VALUE;
			
			for(int j=1;j<=k;j++) {
				if(i-j>=0)
				minJump = Math.min(minJump, dp[i-j]+Math.abs(a[i] - a[i-j]));
			}
			dp[i] = minJump;
		}
		return dp[n-1];
		
	}
}
