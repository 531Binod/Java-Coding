import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr ={34, 23, 5,5, 0, -8 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        boolean swap=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length -i; j++){
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void swap(int[] arr,int first, int last) {
        int temp =arr[first];
        arr[first] =arr[last];
        arr[last] =temp;
    }
     
}