public class removeDuplicate {
    public static String removeDuplicateFromString(String str, int idx, boolean[] map){
        if(idx==str.length()){
            return "";
        }
        char ch = str.charAt(idx);
        if (ch < 'a' || ch > 'z') {
            throw new IllegalArgumentException("Input string contains non-lowercase letters");
        }
        if(map[ch-'a']){
            return removeDuplicateFromString(str, idx+1, map);
        }else{
            map[ch-'a']= true;
            return ch + removeDuplicateFromString(str, idx+1, map);
        }
    }
    public static void main(String[] args) {
        String str = "asdfdsfassd";
        boolean[] present= new boolean[26];
        System.out.println(removeDuplicateFromString(str, 0,present));

    }
    
}
