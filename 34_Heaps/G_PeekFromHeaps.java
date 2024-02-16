import java.util.*;

public class G_PeekFromHeaps {

    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            //add at last idx
            arr.add(data);

            int x = arr.size()-1; //x is child index
            int par = (x-1)/2; //par index

            while (arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par,temp);
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public int remove(){
            int data = arr.get(0);

            //swap 1 - swap first & last
            int temp = arr.get(0);
            arr.set(0,arr.size()-1);
            arr.set(arr.size()-1,temp);

            //swap 2 - delete last
            arr.remove(arr.size()-1);
        }
    }
    public static void main(String args[]){}
}
