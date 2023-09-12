import java.util.*;

public class A_Classroom {
    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();

        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        System.out.println(List);

        int element = List.get(1);
        System.out.println(element);

        List.remove(3);
        System.out.println(List);

        List.set(1, 10);
        System.out.println(List);

        System.out.println(List.contains(10));
        System.out.println(List.contains(11));

        System.out.println(List.size());
    }
}
