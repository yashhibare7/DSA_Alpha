public class J_Tiling {
    public static int tiling(int n){
        //2*n
        if(n == 0 || n == 1){
            return 1;
        }
        //vertical choice
        int fum1 = tiling(n-1);

        //horizontal choice
        int fum2 = tiling(n-2);

        int fn = fum1 + fum2;
        return fn;
    }
    public static void main(String args[]){
        System.out.println(tiling(4));
    }
}
