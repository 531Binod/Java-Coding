import java.util.*;
// We allow to use any name for source fileName only if class is not public
class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float radi =sc.nextFloat();
        double A=3.14*radi*radi;  // we can't use float instead of double bcz incompatible data type
        
        System.out.println("Area of circle is :"+ A);
    }
}