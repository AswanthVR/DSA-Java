package array;
import java.util.*;


public class union_of_two_sorted_array
  {
	public static void main(String args[]) {
		int a[] = {1,1,2,3,4};
		int b[] = {2,3,6,7};
		System.out.println(findUnion(a,b,a.length,b.length));
	}
  
      public static ArrayList<Integer> findUnion(int a[], int b[], int n, int m)
      {
          ArrayList<Integer> union = new ArrayList<>();
          
          int i=0;int j=0;
          
          while(i<n && j<m){
              if(a[i]<=b[j]){
                  if(union.size()==0 || union.get(union.size()-1) != a[i]){
                      union.add(a[i]); 
                  }
                  i++;
              }
              else{
                  if(union.size()==0 || union.get(union.size()-1)!=b[j]){
                      union.add(b[j]);
                  }
                  j++;
              }
          }
          
          while(i<n){
                  if(union.size()==0 || union.get(union.size()-1) != a[i]){
                      union.add(a[i]); 
                  }
                  i++;
              
              
          }
          
          while(j<m){
                  if(union.size()==0 || union.get(union.size()-1)!=b[j]){
                      union.add(b[j]);
                  }
                  j++;
              
          }
          return union;
      }
  }



