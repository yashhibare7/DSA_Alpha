import java.util.*;

public class C_FindMaxNo {
    public static void main(String args[]){
        ArrayList<Integer> res = new ArrayList<>();

        res.add(2);
        res.add(5);
        res.add(9);
        res.add(3);
        res.add(6);

        System.out.println(res);

        int max = Integer.MIN_VALUE;

        for(int i = 0; i<res.size();i++){
            if(res.get(i)>max){
                max = res.get(i);
            }
        }
        System.out.println(max);
    }
}
