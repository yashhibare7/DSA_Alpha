/*
 Tree Map

 keys are sorted

 put,get,remove: O(log n)

 TreeMap<   > hm = new TreeMap<>();
 */

import java.util.TreeMap;

public class G_TreeMap {
    public static void main(String args[]){
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("China", 150);
        tm.put("US", 50);

        System.out.println(tm);
    }
}
