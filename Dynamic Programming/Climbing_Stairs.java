package DP;

public class Climbing_Stairs {
	public static void main(String args[]) {
		int n=4;
		System.out.println(distinct_ways(n));
	}
	
	public static int distinct_ways(int n) {
		if(n<2)
			return 1;
		
		return distinct_ways(n-1)+distinct_ways(n-2);
	}
}
