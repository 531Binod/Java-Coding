import java.util.HashMap;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> myMap = new HashMap<>();
        myMap.put("Ram", 90);  // person age
        myMap.put("ROhit", 45);
        myMap.put("Ramit", 45);

        int res= myMap.get("Ram");
        System.out.println(res);
        System.out.println(myMap);

        for(Map.Entry<String, Integer> e : myMap.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());

        }
        Set<String> keys = myMap.keySet();
        for(String key : keys){
            System.out.println(key+" "+ myMap.get(key));
        }


        /*
        HashMap is unorder, but indexed with key. Its internal implimentation is array of linkedlist.
          HashMap<String,Integer> myMap = new HashMap<>();
          HashMap<Key,value> myMap = new HashMap<>();
         1) mymap.put(key,value)  Insertion if key is not present else change/update the value of key
         2) mymap.get(key)   print the value of given key. return null if key is not present.
         3) mymap.containsKey(key) --> searching boolean type
         4) mymap.remove(key)  --> removal
         5) System.out.print(mymap)  --> print all key-value pair within curly bracket
         6) Iteration (Not Iterator) for loop
          a) Using entrySet()
          b) Using keySet()
            Iteration -1
            Note : Make sure to import package util.* (if u don't know)
            Here Map is from package and myMap is which i created
            for(Map.Entry<String, Integer> e : myMap.entrySet()){
                System.out.println(e.getKey);
                System.out.println(e.getValue);
            }
                It is same as 
                for(int val : arr){
                    print(val);
                }
            Iteration - 2
            Set<String> mykeys = mymap.keySet(); No new keySet
            for(String key : mykeys){
               System.out.print(key+" "+ map.get(key));
            }
         */
    }
}
