import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,0,9,1};
        System.out.println("Array: "+ Arrays.toString(arr));
        quickSort(arr, 0, arr.length-1);
        System.out.print("After quick sort: ");
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int low , int high){
        if (low>=high) {
            return;
        }
        int start =low;
        int end = high;
        int mid = (start + end )/2;
        int pivote = arr[mid];
        
        while (start <= end) {
            // There can be 3 condition 
            // 1. start at correct position
            while (arr[start]< pivote) {
                start ++;
            }
            // 1. end at correct position
            while (arr[end] > pivote) {
                end --;
            }
            // May above 2 while condtion not satisfied ,then if will executed, Swap
            if (start <= end ) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;

            }
            
        }
        quickSort(arr, start, high);
        quickSort(arr, low, end);

    }
}
