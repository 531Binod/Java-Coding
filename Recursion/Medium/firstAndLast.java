public class firstAndLast {
    static int first=-1;
    static int last = -1;
    // all static variables print in main method but use inside recursive function

    public static void printFirstAndLast(String str, int idx, char ch){
        if(idx== str.length()){
            //System.out.println("First: "+ first +" "+ "Last: "+last);
            return;
        }
        char currchar  = str.charAt(idx);
        if(currchar == ch){
            if(first==-1){
                first= idx; // first ++ Incorrect: increments from -1 to 0, regardless of index
            }
            last = idx;  // last++ wrong
        }
        printFirstAndLast(str, idx+1, ch);
    }

    public static void main(String[] args) {
        String str = "ASDGFHJSKL";
        printFirstAndLast(str, 0, 'S');
        System.out.println("First occurence: "+ first +" "+ "Last occurence: "+last);

    }
}
