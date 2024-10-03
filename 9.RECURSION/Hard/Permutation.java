public class Permutation{
    // Time complexity: O(n * n!)
     // Space : O(n)
    public static void printPermutaion(String str, String perm){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curChar = str.charAt(i);
            // next string will exluded current char. so termination condition will be str.length()==0
            String nexString = str.substring(0, i) + str.substring(i+1);
            printPermutaion(nexString, perm + curChar);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutaion(str, "");
    }
}
/*
 Output:
 permutaion means --> Arrangement, only postion will change, same length for each
 subsequence means --> sequence of char  will be maintain (in same order as in given string), but some char can be skip so lengh may be change.
 subset means --> like subsequence but may not be order + null
abc
acb
bac
bca
cab
cba
 */