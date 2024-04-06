/*
 Implementation HashMap

 put(),get(),containsKey(),remove(),size()       O(1)

 India 100
 China 150
 Us    50
 Nepal 5
             
             0     1     2     3
            _______________________
           |    |     |     |     |
           |____|_____|_____|_____|
             |          |     |
          India        US   China
           100         50    150
           |                 
         Nepal             
          5 
 */
import java.util.LinkedList;
import java.util.*;

public class D_HashMapImplementation {
    static class HashMap<K,V>{
      private class Node{
        K key;
        V value;

        public Node(K key, V value){
          this.key = key;
          this.value = value;
        }
      }

        private int n; //size
        private int N;
        private LinkedList<Node> buckets[]; //N

        @SuppressWarnings("unchecked")
        public HashMap(){
          this.N = 4;
          this.buckets = new LinkedList[4];
          for(int i=0; i<4; i++){
            this.buckets[i] = new LinkedList<>();
          }
        }

        private int hashFunction(K key){
          int hc = key.hashCode();
          return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi){
          LinkedList<Node> ll = buckets[bi];
          int di=0;

          for(int i=0;i<ll.size();i++){
            Node node = ll.get(i);
            if(node.key == key){
              return di;
            }
            di++;
          }

          return -1;
        }

        private void rehash() {
          LinkedList<Node> oldBuck[] = buckets;
          buckets = new LinkedList[N*2];
          N = 2*N;
          for(int i=0; i<buckets.length;i++){
            buckets[i] = new LinkedList<>();
          }

          //nodes -> add in bucket
          for(int i=0;i<oldBuck.length;i++){
            LinkedList<Node> ll = oldBuck[i];
            for(int j=0;i<ll.size();j++){
              Node node = ll.remove();
              put(node.key, node.value);
            }
          }
        }

        public void put(K key,V value){ //O(lambda) -> O(1)
          int bi = hashFunction(key); //0 to size-1
          int di = SearchInLL(key, bi); // valid; -1

          if(di != -1){
            Node node = buckets[bi].get(di);
            node.value = value;
          } else{
            buckets[bi].add(new Node(key, value));
            n++;
          }

          double lambda = (double)n/N;
          if(lambda > 2.0){
            rehash();
          }
        }

        public boolean containsKey(K key){ //O(1)
          int bi = hashFunction(key); //0 to size-1
          int di = SearchInLL(key, bi); // valid; -1

          if(di != -1){
            return true;
          } else{
            return false;
          }
        }

        public V remove(K key){ //O(1)
          int bi = hashFunction(key); //0 to size-1
          int di = SearchInLL(key, bi); // valid; -1

          if(di != -1){
            Node node = buckets[bi].remove(di);
            n--;
            return node.value;
          } else{
            return null;
          }
        }

        public V get(K key){ //O(1)
          int bi = hashFunction(key); //0 to size-1
          int di = SearchInLL(key, bi); // valid; -1

          if(di != -1){
            Node node = buckets[bi].get(di);
            return node.value;
          } else{
            return null;
          }
        }

        public ArrayList<K> keySet(){
          ArrayList<K> keys = new ArrayList<>();

          for(int i=0; i< buckets.length; i++){
            LinkedList<Node> ll = buckets[i];
            for(Node node : ll){
              keys.add(node.key);
            }
          }
          return keys;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Nepal", 5);
    }
}
