package array;
import java.util.*;

public class number_that_appears_once_and_the_other_numbers_twice {
	public static void main(String args[]) {
		int a[] = {1,1,2,3,3,4,4,5,5};
		int n  = a.length;
		System.out.println(betterApp(a,n));
		System.out.println(optimalApp(a,n));
	}
	
	public static int betterApp(int a[] , int n) {
		HashMap<Integer , Integer> map = new HashMap<>();
		
		for(int i : a) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<Integer,Integer> it : map.entrySet()) {
			if(it.getValue()==1) {
				return it.getKey();
			}
		}
		return -1;
	}
	public static int optimalApp(int a[] , int n) {
		int xor = 0;
		
		for(int i:a) {
			xor^=i;
		}
		return xor==0 ? -1 : xor;
	}
}
