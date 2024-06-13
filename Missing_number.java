package array;

public class Missing_number {
	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,4,5,6};
		int n = 6;
		int res  = missingNo(a,n);
		System.out.print(res);
	}
	public static int missingNo(int a[] , int n) {
		
		int xor1  = 0;
		int xor2  = 0;
		
		for(int i=0;i<n-1;i++) {
			xor1 = xor1^a[i];
			xor2 = xor2^(i+1);
		}
		xor2^=n;
		
		return xor1^xor2;
	}
}
