/*
 Climbing Stairs

 Count ways of reach the nth stair. The person can climb either 1 stair or 2 stair at a time 
 */

public class D_Climbing_Stairs {
    public static int countWays(int n){
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        return countWays(n-1) + countWays(n-2);
    }
    public static void main(String args[]){
        int n = 5; //n=3 -> 3 & n=4 -> 5 => 8
        System.out.println(countWays(n));
    }
}
