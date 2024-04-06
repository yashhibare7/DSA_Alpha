/*
 Iteration on HashMap

 Set<Integer> keys = hm.keySet(); O(1)

 Example:-
   
   India 100
   China 150
   Nepal 5
   Us    50

   Set<String> keys = hm.keySet();

   Set:-
      "India"
      "China"
      "Nepal"
      "Us"
 */
import java.util.*;

public class C_IterationOnHashmap{
    public static void main(String args[]){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("Nepal", 5);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key="+k+",value="+hm.get(k));
        }
    }
}