package array;


//There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
//
//Note: Start the array with positive elements.
public class V1_Rearrange_Array_Elements_by_Sign {
	public static void main(String args[]) {
		int a[] = {1,2,-3,5,-2,-3};
		
		rearrange(a);
	}
	public static void  rearrange(int a[]) {
		int n = a.length;
		
		int posIdx = 0;
		int negIdx = 1;
		int res[] = new int[n];
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				res[negIdx]=a[i];
				negIdx+=2;
			}
			else {
				res[posIdx] = a[i];
				posIdx+=2;
			}
		}
		
		for(int i : res) {
			System.out.print(i+" ");
		}
	}
}
