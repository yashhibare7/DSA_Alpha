public class A_NoInDecreasingOrder{
    public static void DecOrd(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        DecOrd(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        DecOrd(n);
    }
}