public class PrintKeypadCombination {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKeypadCombination(String number, int idx, String res){
        if(idx== number.length()){
            System.out.println(res);
            return;
        }
        char curNumber = number.charAt(idx); // "23" --> '2'
        for(int i=0;i<keypad[curNumber-'0'].length();i++){
            char curChar = keypad[curNumber-'0'].charAt(i); // kepad[2].charAt(i) = "def".charAt(i)
            printKeypadCombination(number, idx+1, res + curChar ); // once u hit botton then must be atleast on char. 
                                                                // So no concept of chose or nooot chose
        }
    }
    public static void main(String[] args) {
        String str = "23"; // You press keyword 2 and 3 of Nokia mobile then all possible strings are? 
        printKeypadCombination(str, 0, "");
    }
}
/*
Input "23"
Output:
dg
dh
di
eg
eh
ei
fg
fh
fi
 */
