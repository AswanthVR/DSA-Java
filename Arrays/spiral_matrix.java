package array;

import java.util.ArrayList;
import java.util.List;

//Problem Statement: Given a matrix, your task is to rotate the matrix 90 degrees clockwise
//Input:
//	 [[1,2,3],[4,5,6],[7,8,9]]
//
//	Output
//	: [[7,4,1],[8,5,2],[9,6,3]]
//
//	Explanation:
//	 Rotate the matrix simply by 90 degree clockwise and return the matrix.
public class spiral_matrix {
	public static void main(String args[]) {	
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		spiralMatrix(a);
	}
	public static void spiralMatrix(int a[][]) {
		int n = a.length;
		int m = a[0].length;
		int top=0,left=0;
		int bottom = n-1,right = m-1;
		List<Integer> res = new ArrayList<>();
		
		while(left<=right && top<=bottom) {
		for(int i=left;i<=right;i++) {
			res.add(a[top][i]);
		}
		top++;
		
		for(int i=top;i<=bottom;i++) {
			res.add(a[i][right]);
		}
		right--;
		
		if(top<=bottom) {
		for(int i=right;i>=left;i--) {
			res.add(a[bottom][i]);
		}
		bottom--;
		}
		
		if(left<=right) {
		for(int i=bottom;i>=top;i--) {
			res.add(a[i][left]);
		}
		left++;
		}
		
		}
		System.out.print(res);
		
	}

}
