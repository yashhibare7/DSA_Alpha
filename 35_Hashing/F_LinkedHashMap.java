/*
 LinkedHashMap

 keys are insertion ordered

 LinkedHashMap<   > hm = new LinkedHashMap<>(); 
 */

import java.util.LinkedHashMap;

public class F_LinkedHashMap {
    public static void main(String args[]){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        System.out.println(lhm);
    }
}
