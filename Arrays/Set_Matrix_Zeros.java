package array;

//Set Matrix Zero
// 
//Problem Statement:
//	Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and 
//	then return the matrix.
//Examples 1:
//
//
//Input:
// matrix=[[1,1,1],[1,0,1],[1,1,1]]
//
//Output:
// [[1,0,1],[0,0,0],[1,0,1]]
//
//Explanation:
// Since matrix[2][2]=0.Therfore the 2nd column and 2nd row wil be set to 0

public class Set_Matrix_Zeros {
	
	public static void main(String args[]) {
		int a[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		int r = a.length;
		int c = a[0].length;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("RESULT : ");
		
//		brute_force_approach(a,r,c);
//		Better_Approach(a, r, c);
		Optimal_Approach(a, r, c);
		
		
	}
//brute force
public static void brute_force_approach(int a[][] , int r, int c) {
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j] == 0) {
					setRowZero(a,r,c,i);
					setColZero(a,r,c,j);
				}
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]==-1) {
					a[i][j] = 0;
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void setRowZero(int a[][],int r,int c,int k) {
		for(int i=0;i<c;i++) {
			a[k][i]=-1;
		}
	}
	public static void setColZero(int a[][],int r,int c,int k) {
		for(int i=0;i<r;i++) {
			a[i][k]=-1;
		}
	}
////////////////////////////////////////////////////////////////////////////

//Better Approach
	public static void Better_Approach(int a[][] , int r, int c) {
		int row[] = new int [r];
		int col[] = new int [c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j]==0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(row[i]==1 || col[j]==1) {
					a[i][j] = 0;
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
/*//////////////////////////*/
//Optimal Approach
public static void Optimal_Approach(int a[][] , int r, int c) {
		int col0=1;
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(a[i][j] == 0) {
					a[i][0] = 0;
					
					if(j==0) {
						col0=0;
					}
					else {
						a[0][j] = 0;
					}
				}
				
			}
		}
		
		for(int i=1;i<r;i++) {
			for(int j=1;j<c;j++) {
				if(a[i][0] == 0 || a[0][j]==0) {
					a[i][j] = 0;
				}
			}
		}
		
		if(a[0][0] == 0) {
			for(int j=0;j<c;j++) {
				a[0][j]=0;
			}
		}
		
		if(col0 == 0) {
			for(int i=0;i<r;i++) {
				a[i][0] = 0;
			}
		}
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
