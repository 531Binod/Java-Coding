import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {4,6,7,2,3,0};
        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.println("After Merge sort: ");
        // mergeSort(arr); Nooo , it will return array, so store or directly print it.
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length /2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        
        return merge(left , right);
    }
    public static int[] merge(int[] start, int[] last){
        int[] mix = new int[start.length + last.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i< start.length && j< last.length) {
            if(start[i]> last[j]){
                mix[k] = last[j];
                j += 1;
                k +=1;
            }else{
                mix[k]=start[i];
                i ++;
                k ++;
            }
            
        }
        while(i< start.length){
            mix[k]=start[i];
            i++;
            k++;
        }
        while(j< last.length){
            mix[k]=last[j];
            j++;
            k++;
        }
        return mix;
    }
}
