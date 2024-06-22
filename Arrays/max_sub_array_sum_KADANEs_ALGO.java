package array;

public class max_sub_array_sum_KADANEs_ALGO {
	public static void main(String args[]) {
		int a[]= {-2, 1, -3, 4, -2, 2, 1, -5, 4};
		
		int res = max_sub_array_sum(a);
		System.out.println(res);
		max_sub_array_sum_with_index(a);
	}
	
	public static int max_sub_array_sum(int a[]) {
		int n = a.length;
		
		int sum = 0;
		int maxi =Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			sum+=a[i];
			
			if(sum>maxi) {
				maxi = sum;
			}
			else if(sum<0) {
				sum=0;
			}
		}
		return maxi;
	}
	
	
	public static void max_sub_array_sum_with_index(int a[]) {
		int n = a.length;
		
		int start = -1;
		int s = -1;
		int end = -1;
		int maxi = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			
			if(sum==0)
				 s = i;
			
			sum+=a[i];
			
			if(sum > maxi) {
				start = s;
				end = i;
				maxi = sum;
			}
			else if(sum<0) {
				sum=0;
			}
			
		}
		System.out.println("The maximum sum is "+maxi);
		
		for(int i=start ; i<=end ; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
}

