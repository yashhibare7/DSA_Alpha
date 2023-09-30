public class D_SumOfFirstNum {
    public static int SumNum(int n){
        if (n == 1){
            return 1;
        }
        int fun1 = SumNum(n-1);
        int fn = n + SumNum(n-1);
        return fn;
    }
   public static void main(String args[]){
    int n =5;
    System.out.println(SumNum(n));
   } 
}
