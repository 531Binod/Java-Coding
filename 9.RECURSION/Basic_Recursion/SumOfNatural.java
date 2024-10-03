public class SumOfNatural {

    public static int sumOfNaturalNumber(int n){
        if(n==1){
            return 1;
        }
        int sum = n + sumOfNaturalNumber(n-1);
        return sum;
    }

    public static void printSum(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum  += n;
        printSum(n-1, sum);
    }
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumber(10));
        printSum(10, 0);
    }
}
