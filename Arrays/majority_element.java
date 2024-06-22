package array;

import java.util.HashMap;
import java.util.Map;

public class majority_element {
	public static void main(String args[]) {
		int a[] = {1,2,4,2,1,2,2,2,4,4,2,3,6,2,2};
		 
		int res_better = findMajorityElement_better(a);
		int res_optimal  = findMajorityElement_optimal(a);
		
		System.out.println(res_better+"\n"+res_optimal);
	}
	
	public static int findMajorityElement_optimal(int a[]) {
		int n   = a.length;
		int c   = 0;
		int ele = 0;
		for(int i=0;i<n;i++) {
			if(c == 0)
			{
				c=1;
				ele = a[i];
			}
			else if(a[i] == ele) {
				c++;
			}
			else {
				c--;
			}
		}
		
		int c1=0;
		
		for(int i=0;i<n;i++) {
			if(a[i] == ele)
				c1++;
		}
		
		if(c1>=(n/2))
			return ele;
		
		return -1;
	}
	
	public static int findMajorityElement_better(int a[]) {
		HashMap<Integer , Integer> map = new HashMap<>();
		int n = a.length;
		for(int i=0;i<n;i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		for(Map.Entry<Integer,Integer> it : map.entrySet()) {
			if(it.getValue()>n/2)
				return it.getKey();
		}
		return -1;
		
		
	}
}
