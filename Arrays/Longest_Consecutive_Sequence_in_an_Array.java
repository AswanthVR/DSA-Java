package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Problem Statement: 
//	You are given an array of ‘N’ integers. You need to find the length of the longest sequence which contains the consecutive elements.
//	Example 1:
//
//
//		Input:
//		 [100, 200, 1, 3, 2, 4]
//
//		Output:
//		 4
//
//		Explanation:
//		 The longest consecutive subsequence is 1, 2, 3, and 4.
//
//		Input:
//		 [3, 8, 5, 7, 6]
//
//		Output:
//		 4
//
//		Explanation:
//		 The longest consecutive subsequence is 5, 6, 7, and 8.
public class Longest_Consecutive_Sequence_in_an_Array {
	
	public static void main(String args[]) {
		int a[] = {3, 8, 5, 7, 2,1,0,4};
		System.out.println(brute_force_approach(a));
		System.out.println(better_approach(a));
		System.out.println(Optimal_approach(a));
	}
	
//brute force approach	
	public static int brute_force_approach(int a[]) {
		int n = a.length;
		int maxi = 0;
		for(int i=0;i<n;i++) {
			int x = a[i];
			int c=1;
			while(isPresent(a,x+1)) {
				x+=1;
				c+=1;
			}
			maxi = Math.max(maxi, c);
		}
		return maxi;
	}
	
	public static boolean isPresent(int a[] , int x) {
		for(int i:a) {
			if(i==x) {
				return true;
			}
		}
		return false;
	}
	
	
//better approach
	public static int better_approach(int a[]) {
		int n = a.length;
		int lastSmallest = Integer.MIN_VALUE;
		int c=0;
		int longest = 1;
		
		
		Arrays.sort(a);
		
		for(int i=0;i<n;i++) {
			if(a[i]-1 == lastSmallest) {
				c+=1;
				lastSmallest = a[i];
			}
			
			else if(a[i] != lastSmallest) {
				c=1;
				lastSmallest = a[i];
			}
			longest = Math.max(longest, c);
		}
		return longest;
		
	}
	
	
//Optimal Approach
	
	public static int Optimal_approach(int a[]) {
		int n = a.length;
		int longest = 1;
		
		Set<Integer> set = new HashSet<>();
		
		for(int i:a) {
			set.add(i);
		}
		
		for(int i : set) {
			if(!set.contains(i-1)) {
				int c = 1;
				int x = i;
				while(set.contains(x+1)) {
					c++;
					x++;
				}
				longest = Math.max(c, longest);
			}
			
		}
		return longest;
		
	}

}
