import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static boolean isgre(int al[]){
        int n = al.length;
        for(int i=0;i<n-1;i++){
            if(al[i]>al[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void printarr(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int a = 5;
        int b = 10;

        a += b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a "+a);
        System.out.println("Value of b "+b);

        

    }
}
