package array;

import java.util.HashMap;

public class two_sum {

    public static int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int cur = nums[i];
            int needed = target - cur;
            if(map.containsKey(needed)){
                res[1] = i;
                res[0]=  map.get(needed);
                return res;
            }
            map.put(nums[i] , i);
        }
          return res;
    }
    public static void main(String args[]) {
    	int a[] = {1,2,4,5,3,6};
    	int target = 9;
    	int res[] = twoSum(a,target);
    	System.out.print(res[0]+" "+res[1]);
    	
    	
    }
}