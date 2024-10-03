import java.util.LinkedList;
import java.util.*;

public class hashMapCode {
    static class  HashMap<k, v> {  // Generic used when data type is unknown
        // Node structure
        private class  Node {
            k key;
            v value; // value which data type is v

            // constructor
            public Node( k key, v value){
                this.key = key;
                this.value = value;
            }
        }
        // Node structure end
        // HashMap is a array of linkedlist. Let's say array as bucket and its index as bi (bucket index) 
        int n; // no. of node
        int N; // size of bucket

        // create a bucket array that contain linkedlist of type node (type of element in bucket) 
        // same as private int arr[];

        private LinkedList<Node> bucket[]; // N is bucket length.

        @SuppressWarnings("unchecked")
        
        // constructor of hashMap (not node) Hashmap structure
        public HashMap() {
            this.N = 4;
            this.bucket = new LinkedList[4];  // bucket (ArrayList) initialized with null 
            // now create empty linledlist (i.e new linkedlist) at each index
            for(int i=0;i<4;i++){
                this.bucket[i] = new LinkedList<>();
            }
        }

        // hshFunction is used to find the bucket index of key so that we can search directly on that index and get it in O(1)

        private int hashFunction(k key){
            int bi = key.hashCode();
            return Math.abs(bi)% N;
        }
        private int searchInLL(k key, int bi){
            LinkedList<Node> li = bucket[bi];
            for(int i=0;i<li.size();i++){
                if(li.get(i).key==key){
                    return i ;//di
                }
            }
            return -1;

        }
        private void reHash(){
            LinkedList<Node> oldBuckets[]  = bucket; // current bucket element copy into old bucket
            bucket = new LinkedList[2*N];   // new bucket created with size double.
            for(int i=0;i<2*N;i++){
                bucket[i] = new LinkedList<>(); // initialize bucket with linkedList empty
            }
            for(int i=0;i<oldBuckets.length;i++){
                LinkedList<Node> li = oldBuckets[i];
                for(int j=0;j<li.size();j++){
                    // get each node
                    Node node = li.get(i);
                    put(node.key, node.value);
                }
            }


        }
        public void put(k key, v value){
            // get bucket index of key
            int bi = hashFunction(key);
            // Now seach data index in linkedlist at bi
            int di = searchInLL(key,  bi);

            if(di==-1){  // key not exist
                // create new node
                bucket[bi].add(new Node(key, value));
                n++;
            }else{
                // update value
                Node node = bucket[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;
            if(lambda> 2.0){
                reHash();
            }
        }
        public v get(k key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di==-1){
                return null;
            }else{
                Node node = bucket[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(k key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di==-1){
                return false;
            }else{
                return true;
            }
        }

        public v remove(k key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if(di==-1){
                return null;
            }else{
                Node node = bucket[bi].remove(di); // bucket[bi] store linkedlist. and LL has function remove
                n--;
                return node.value;
            }
        }

        public ArrayList<k> keySet(){
            ArrayList<k> keys = new ArrayList<>();
            for(int i=0; i<bucket.length;i++){
                 // extract LL
                LinkedList<Node> ll = bucket[i];
                // extract node
                for(int j=0;j<ll.size();j++){
                    Node node  = ll.get(j);
                    keys.add(node.key);

                }
            }
            return keys;
           
        }

        public boolean isEmpty(){
            return n==0;
        }


    }
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        // country and population
        map.put("India", 130);
        map.put("China", 150);
        map.put("Rassia",100);

        ArrayList<String> keys = map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+ map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }

}
