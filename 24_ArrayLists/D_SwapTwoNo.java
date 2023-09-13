import java.util.*;

public class D_SwapTwoNo {
    public static void swap(ArrayList<Integer> res,int idx1 ,int  idx2){
        int temp = res.get(idx1);
        res.set(idx1, res.get(idx2));
        res.set(idx2, temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> res = new ArrayList<>();

        res.add(2);
        res.add(5);
        res.add(9);
        res.add(3);
        res.add(6);

        int idx1 = 1 , idx2 = 3;
        System.out.println(res);
        swap(res,idx1,idx2);
        System.out.println(res);
    }
}
