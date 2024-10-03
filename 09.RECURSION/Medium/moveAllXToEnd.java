public class moveAllXToEnd {
    public static String moveX(String str,int idx , int count){
        if(str.length()==idx){
            return addX(count);
        }
        if(str.charAt(idx)=='x'){
            return moveX(str, idx+1, count+1); // Incorrect count++ 
            //nstead of count++, you now use ++count when passing count to the recursive call. 
            //This ensures that count is incremented before it's used in the recursion.
        }else{
            String nextstr = moveX(str, idx+1, count);
            return str.charAt(idx) + nextstr;
        }
    }
    public static String addX(int count){
        String str = "";
        for(int i=0;i<count;i++){
            str += 'x';
        }return str;
    }
    public static void main(String[] args) {
         String str = "asxsdxcfgbxjklxlkj";
         System.out.println(moveX(str, 0, 0));
    }
}
