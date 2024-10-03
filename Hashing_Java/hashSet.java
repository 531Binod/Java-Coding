import java.util.HashSet;
import java.util.Iterator;
public class hashSet{
    public static void main(String[] args) {
        HashSet<Integer> myset = new HashSet<>();
        myset.add(2);
        myset.add(5);
        myset.add(0);
        myset.add(5);
        myset.remove(2);
        System.out.println(myset.size());
        System.out.println(myset);
        if(myset.contains(5)){
            System.out.println("Yes, 5 is here");
        }
        Iterator it = myset.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        /*
        HashSet mean set. i.e unique value, unorder, no duplicate
        1) myset.add(x) for insertion O(1)
        2) myset.remove(x) for removal O(1)
        3) myste.contains(x)  for search O(1)   boolean type
        4) myset.size()   length of set
        5) myset.isEmpty() 
        6) System.out.print(myset) --> print all element within square bracket
        7) Iterator --> used to iterate. print all element without square bracket Iteration. HashSet does not have an order. 
           - boolean type
           Iterator it = myset.iterator()
           a) myset.next()  --> it.next() 
           b) myset.hasNext() xxx  --> it.hasNext()  [Assume as Linkedlist last element has null. 
                                       i.e hasNext() will return false]
        */

        
    }
}