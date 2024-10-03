public class reverseOfString {
    public static void reverse(int idx, String str, String rev){
        if(idx==0){
            rev +=str.charAt(idx);
            System.out.println(rev);
            return;
        }
        //char cuurChar = str.charAt(idx);
        rev += str.charAt(idx);
        reverse(idx-1, str, rev);

    }
    // without void recursive call
    public static String reverse2(String str){
        if(str.length()==1){
            return str;
        }
        char currstring = str.charAt(0);
        String nextstring  = reverse2(str.substring(1));
        return nextstring + currstring;
    }
    public static void main(String[] args) {
        String str = "ASDFG";
        reverse(str.length()-1, str, "");
        System.out.println(reverse2("asdfg"));
    }
}
