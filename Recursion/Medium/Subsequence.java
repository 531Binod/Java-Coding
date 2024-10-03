import java.util.HashSet;
public class Subsequence {
    // O(2^n)
    public static void printSubsequence(String str, int idx, String res){
        if (idx == str.length()) {
            System.out.println(res);
            return;
        }
        // choose ist char of str
        printSubsequence(str, idx+1, res + str.charAt(idx)); // we can't return two (line 8 & 10 statment without if else statement. so se void
        // Not choose
        printSubsequence(str, idx+1, res);
    }
    public static void printUniqueSubsequence(String str, int idx, String res, HashSet<String> set){
        if (idx == str.length()) {
            if (set.contains(res)) {
                return;
            }
            set.add(res); // add the result to the set
            System.out.println(res);
            return;
        }
        // choose ist char of str
        printUniqueSubsequence(str, idx+1, res + str.charAt(idx), set); // we can't return two (line 8 & 10 statment without if else statement. so se void
        // Not choose
        printUniqueSubsequence(str, idx+1, res, set);
    }
    public static void main(String[] args) {
        
        String str = "abc";
        String str1 = "aaa";
        printSubsequence(str, 0, "");
        printSubsequence(str1, 0, "");
        System.out.println("Below how treat the duplicate ");
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        printUniqueSubsequence(str, 0, "", set1);
        printUniqueSubsequence(str1, 0, "", set2);
    }
}
/*
Input = "abc"
 Output
                             chose                              Not chose
    Decide a                     a                                __
    decide b                ab        a_                     -b        --
    decide c            abc  ab-   a_c  a_ _             -bc  -b-      ---


abc            
ab
ac
a
bc
b
c
Unique
aaa
aa
a
 */
