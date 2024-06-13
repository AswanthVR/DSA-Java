package array;

//There’s an array ‘A’ of size ‘N’ with positive and negative elements (not necessarily equal). Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values. The leftover elements should be placed at the very end in the same order as in array A.
//
//Note: Start the array with positive elements.
import java.util.ArrayList;

public class V2_Rearrange_Array_Elements_by_Sign {
	public static void main(String args[]) {
		int a[] = {1,2,-3,-1,-2,-3};
		rearrange(a);
	}
	public static void rearrange(int a[]) {
		int n = a.length;
		
		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();
		
		for(int i : a) {
			if(i>0)
				pos.add(i);
			else
				neg.add(i);
		}
		
		// If positives are greater than the negatives.
		if(pos.size()>neg.size()) {
			
			// First, fill array alternatively till the point 
            // where positives and negatives are equal in number.
			for(int i=0;i<neg.size();i++) {
				a[i*2] = pos.get(i);
				a[i*2+1] = neg.get(i);
			}
			
			int idx = neg.size()*2;
			
			// Fill the remaining positives at the end of the array.
			for(int i = neg.size();i<pos.size();i++) {
				a[idx] = pos.get(i);
				idx++;
			}
			
		}
		
		// If positives are lesser than the negatives.
		else {
			
			// First, fill array alternatively till the point 
            // where positives and negatives are equal in number.
			for(int i=0;i<pos.size();i++) {
				a[i*2] = pos.get(i);
				a[i*2+1] = neg.get(i);
			}
			
			int idx = pos.size()*2;
			
			// Fill the remaining negatives at the end of the array.
			for(int i = pos.size();i<neg.size();i++) {
				a[idx] = neg.get(i);
				idx++;
			}
		}
		
		for(int i : a) {
			System.out.print(i+" ");
		}
	}
}
