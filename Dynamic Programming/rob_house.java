package DP;

public class rob_house {
	public static void main(String args[]) {
		int a[] = {2,7,9,3,1};
		int n = a.length;
		
		int dp[] = new int[n];
		dp[0] = a[0];
		
		for(int i=1;i<n;i++) {
			int take = a[i];
			if(i>1)
				take+=dp[i-2];
			int not_take = dp[i-1];
			
			dp[i] = Math.max(take, not_take);
		}
		System.out.println(dp[n-1]);
		
	}
}
