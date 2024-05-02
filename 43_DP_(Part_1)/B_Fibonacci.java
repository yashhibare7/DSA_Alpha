public class B_Fibonacci {
    public static int fib(int n, int f[]){
        if(n == 0 || n == 1){
            return n;
        }

        if(f[n] != 0){ //f[n] is not equal to zero then fibonacci exist
            return f[n];
        }

        f[n] = fib(n-2,f) + fib(n-1,f);
        return f[n];
    }
   public static void main(String args[]){
    int n=5;
    int f[] = new int[n+1]; //0 , 0 , 0 already assign 
    System.out.println(fib(n, f));
   }    
}
