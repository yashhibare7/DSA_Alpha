import java.util.*;
public class B_ReverseArray {
    public static void main(String args[]){
        ArrayList<Integer> res = new ArrayList<>();

        res.add(1);
        res.add(2);
        res.add(3);
        res.add(4);
        res.add(5);

        System.out.println(res);

        for(int i = res.size()-1;i>=0;i--){
            System.out.print(res.get(i)+" ");
        }
    }
}
