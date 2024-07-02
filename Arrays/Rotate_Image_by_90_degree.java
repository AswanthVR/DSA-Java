package array;

//Rotate Image by 90 degree
// 
//Problem Statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise.
//Input:
//	 [[1,2,3],
//	  [4,5,6],
//	  [7,8,9]]
//
//Output
//	[[7,4,1],
//	 [8,5,2],
//	 [9,6,3]

public class Rotate_Image_by_90_degree {
	public static void print(int a[][]) {
		int n = a.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
//		 print(brute_force_approach(a));
		 print(optimal_approach(a));
	}
	
	public static int[][] brute_force_approach(int a[][]){
		int n = a.length;
		int res[][] = new int [n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				res[j][n-i-1] = a[i][j];
			}
		}
		return res;
	} 
	
	public static int[][] optimal_approach(int a[][]){
		int n = a.length;
		
		for(int i = 0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n/2;j++) {
				int t = a[i][j];
				a[i][j] = a[i][n-j-1];
				a[i][n-i-1] = t;
			}
		}
		return a;
	}
}
	

