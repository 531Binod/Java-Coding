import java.util.Arrays;

public class mergeSortInplc {
    public static void main(String[] args) {
        int[] arr = {4,6,7,2,3,0};
        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.println("After Merge sort: ");
        mergeSortIn(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSortIn(int[] arr, int start, int end){
        if(end-start==1){
            return ;
        }
        int mid = ( start+end) /2;
        mergeSortIn(arr, start, mid);
        mergeSortIn(arr, mid, end);
        
        mergeInplace(arr, start, mid, end);
    }
    static void mergeInplace(int[] arr, int s, int m, int e){
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i< m && j< e) {
            if(arr[i]> arr[j]){
                mix[k] = arr[j];
                j += 1;
                k +=1;
            }else{
                mix[k]=arr[i];
                i ++;
                k ++;
            }
            // U can increment k here bcz k has to increment irrespective of if or else.
        }
        while(i< m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j< e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0; l< mix.length; l++){
            arr[s+l] = mix[l];
        }
        
    }
}
