package array;

//Problem Statement
//
//Given an array A of size N that contains only non-negative integers, find a continuous sub-array that adds to a 
//given number S and return the left and right indexes of that sub-array. In the case of multiple subarrays, 
//return the subarray indexes that come first when moving from left to right.

//Example 1
//Input:
//
//N = 5, S = 12
//
//A[5] = {1,2,3,7,5}
//
//Output:
//
//2 4
//
//Explanation:
//The sum of elements from the 2nd position to the 4th position is 12.

//Example 2 
//Input:
//
//N = 10, S = 15
//
//A[10] = {1,2,3,4,5,6,7,8,9,10}
//
//Output:
//
//1 5
//
//Explanation:
//
//The sum of elements from the 1st position to the 5th position is 15.
import java.util.*;
public class Subarray_Sum_Equals_to_a_Given_Number {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();  // Read length of the array
        int S = scanner.nextInt();  // Read the sum to find
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();  // Read array elements
        }
        
        int start = 0;
        int currentSum = 0;
        
        for (int end = 0; end < N; end++) {
            currentSum += A[end];
            
            while (currentSum > S && start <= end) {
                currentSum -= A[start];
                start++;
            }
            
            if (currentSum == S) {
                System.out.println((start + 1) + " " + (end + 1));  // +1 for 1-based indexing
                return;
            }
        }
        
        System.out.println("-1");  // If no subarray found
    }
}
