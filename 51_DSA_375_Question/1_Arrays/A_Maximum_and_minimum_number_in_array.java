/*
Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
              Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
              Maximum element is: 35
 */

import java.util.Arrays;

public class A_Maximum_and_minimum_number_in_array {
    public static int maxnum(int arr[], int N){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int minnum(int arr[], int N){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int[] arr = {3,5,4,1,9};
        int N = arr.length;

        System.out.println("Minimum number of array = "+minnum(arr, N));
        System.out.println("Maximum number of array = "+maxnum(arr, N));
    }
}
