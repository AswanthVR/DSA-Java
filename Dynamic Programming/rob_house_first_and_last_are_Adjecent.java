package DP;
import java.util.*;
public class rob_house_first_and_last_are_Adjecent {
	public static void main(String args[]){
		int a[] = {2,3,4};
		System.out.println(rob(a));
		
	}
    public static int rob(int[] nums) {
        int  n = nums.length;

        if(n==1)
        return nums[0];

       ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();


            for(int i=0; i<n; i++){

            if(i!=0) arr1.add(nums[i]);
            if(i!=n-1) arr2.add(nums[i]);
            }     

            return Math.max(rob1(arr2) , rob1(arr1));
    }

    public static int rob1(ArrayList<Integer> a){

        int n = a.size();
        if(n==1)
        return a.get(0);

        int dp[] = new int [n];

        dp[0] = a.get(0);

        for(int i=1;i<n;i++){
            int take= a.get(i);
            if(i>1)
            take+=dp[i-2];
            int not = dp[i-1];
            dp[i] = Math.max(take,not);
        }
        return dp[n-1];
    }
	
}
