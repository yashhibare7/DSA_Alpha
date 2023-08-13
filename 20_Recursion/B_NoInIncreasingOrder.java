public class B_NoInIncreasingOrder {
    public static void IncOdr(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        IncOdr(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        int n=10;
        IncOdr(n);
    }
}
