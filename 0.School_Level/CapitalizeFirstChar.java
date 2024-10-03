public class CapitalizeFirstChar {  
public static String capitalizeWord(String str){  
    String words[]=str.split("\\s");  
    String capitalizeWord="";  
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
    }  
    return capitalizeWord.trim();  
}
public static void main(String[] args) {  
    System.out.println(CapitalizeFirstChar.capitalizeWord("my name is khan"));  
    System.out.println(CapitalizeFirstChar.capitalizeWord("I am sonoo jaiswal"));
    //String str ="My name is khan";
    //String words[]=str.split("\\s");
    //System.out.println(words); 
    }  
}  

