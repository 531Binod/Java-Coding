import java.util.Scanner;

public class isSortedAray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size =sc.nextInt();
        int[] arr= new int[size];
        for(int i=0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean isAssending = true;
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isAssending=false;
            }
        }
        if(isAssending){System.out.println("Sorted array ");}
        else{System.out.println("Not sorted array");}

    }
}
