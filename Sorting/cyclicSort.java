import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr= {4,6,7,3,5,1,2,8};  // 1 to 8 element;
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void cyclicSort(int[] arr) {
        /* problem with for loop bcz new element at index o  may not be correct so it is unknown how many time i=o run*/
        /* 
        for(int i=0; i<arr.length; i++){
            int correctIndex = arr[i]-1;
            if (arr[i]!=arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
        }  */
        int i=0;
        while (i<arr.length) {
            int correctIndex = arr[i]-1;
            if (arr[i]!=arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }else{
                i++;
            }
            
        }
    }
    public static void swap(int[] arr,int first, int last) {
        int temp =arr[first];
        arr[first] =arr[last];
        arr[last] =temp;
    }
}
