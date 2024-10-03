import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,7,78,3,2,4,4 ,0 ,-5};
        System.out.println("Array: "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After insertion sort: "+ Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){ // not j>=0 bcz j-1=-1 invalid index
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                }else{
                    break;
                }
            }
        }   
    }
    public static void swap(int[] arr,int first, int last) {
        int temp =arr[first];
        arr[first] =arr[last];
        arr[last] =temp;
    }
}
