import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2, 4 , 5 ,7 ,8,0,-6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        for(int i=0;i<arr.length-1; i++){
            int lastPos=arr.length -1-i;
            int maxIndex = getMaxIndex(arr,0, lastPos);
            swap(arr, lastPos, maxIndex);
        }
        
    }
    public static void swap(int[] arr,int first, int last) {
        int temp =arr[first];
        arr[first] =arr[last];
        arr[last] =temp;
    }
    public static int getMaxIndex(int[] arr,int first, int last){
        int max = first;
        for(int i=first;i<=last;i++){
            if (arr[max]< arr[i]) {
                max=i;
            }
        }return max;
    }
}
