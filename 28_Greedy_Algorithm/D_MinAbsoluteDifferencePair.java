//Given two array A and B of equal length n. pair each element of array A to an element in array B, Such that sum S of 
//absolute difference of all the pairs is minimum.

//A=[1,2,3]
//B=[2,1,3]       ans=0

import java.util.*;

public class D_MinAbsoluteDifferencePair {
    public static void main(String args[]){
        int A[] = {4,1,8,7};
        int B[] = {2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i=0;i<A.length;i++){
            sum += Math.abs(A[i]-B[i]);
        }

        System.out.println(sum);

    }
}
