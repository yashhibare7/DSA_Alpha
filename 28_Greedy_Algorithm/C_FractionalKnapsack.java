//Given the weights and values of N items, put these items in a knapsack of capacity W to get the  maximum  total 
//value in the kanpsack.

//value = [60,100,120]
//weight = [10,20,30]          ans = 240
//W = 50

import java.util.*;
import java.util.Comparator;

public class C_FractionalKnapsack{
    public static void main(String args[]){
        int val[] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col => idx; 1st col => ratio

        for(int i=0;i<val.length;i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;

        for(int i=ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) { //Include full item
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                //
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final Value : "+ finalVal);
    }
}