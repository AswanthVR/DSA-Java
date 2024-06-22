package array;
import java.util.*;
public class array_intersection {
	public static void main(String args[]) {
		int a[] = {1,2,3,3,4,5};
		int b[] = {2,2,3,3,4};
		
		System.out.print(findIntersection(a,b,a.length,b.length));
	}
	
	public static ArrayList<Integer> findIntersection(int a[] ,int b[] , int n, int m){
		
		boolean visited[] = new boolean[m];
		ArrayList<Integer> intersection = new ArrayList<>();
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				if(a[i] == b[j] && visited[j]==false) {
					intersection.add(a[i]);
					visited[j] = true;
					break;
				}
				//because array is sorted , element will not be beyond this
				else if (b[j] > a[i]) 
					break; 
			}
		}
		return intersection;
		
	}
}
