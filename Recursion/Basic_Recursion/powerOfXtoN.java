public class powerOfXtoN {
    // O(n)
    public static double power(double x, double n){
        if(n==0){
            return 1;
        }
        if (x==0) {
            return 0;
        }if(n<0){
            return 1/power(x, -n); // n is already -ve so take one more -ve so it becomes +ve.
        }
        else{
            return x * power(x, n-1);
        }
    }
    // O(logn)
    public static double power2(double x, double n){
        if(n==0){
            return 1;
        }
        if (x==0) {
            return 0;
        }if(n<0){
            return 1/power(x, -n); // n is already -ve so take one more -ve so it becomes +ve.
        }
        else if(n%2==1){
            return x * power(x, n/2) * power(x, n/2); // x * power(x,n-1)
        }else{
            return power(x, n/2) * power(x, n/2);    // power(x^2 , n/2) n/2 power of x square is equal to x^n
        }
    }

    public static void main(String[] args) {
        System.out.println(power(2, -2));
        System.out.println("With logn");
        System.out.println(power2(2, 4));
    }
}
