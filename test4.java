import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
        int[] arr = {23,4,7,8,2,-8};
        //bubbleSort(arr);
        //insertionSort(arr);
        //selectionSort(arr);
        //mergeSort(arr);
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] bubbleSort(int[] arr){
        boolean swap=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    swap = true;
                }
            }if(!swap){
                return arr;
            }
        }
        return arr;
    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int max = arr[i];
            int lastpos=arr.length-1-i;
            int getMaxIndex = getMaxIndex(arr,0,lastpos);
            swap(arr, lastpos, getMaxIndex);

        }
    }
    public static int getMaxIndex(int[] arr, int start, int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }return max;
    }
    public static void swap(int[] arr ,int a, int b){
        int temp = arr[a];
        arr[a]= arr[b] ; 
        arr[b]=temp;
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left= mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid,arr.length));
        return merge(left, right);
    }
    public static int[] merge(int[] left, int[] right){
        int[] res= new int[left.length+right.length];
        int i=0;
        int j=0;
        int k=0;
        while ((i<left.length && j<right.length)) {
            if(left[i]<right[j]){
                res[k] = left[i];
                k++;
                i++;
            }else{
                res[k]= right[j];
                k++;
                j++;
            }
            
        }
        while(i<left.length){
            res[k]= left[i];
            i++;
            k++;
        }
        while(j<right.length){
            res[k]= right[i];
            j++;
            k++;
        }
        return res;
        //System.out.println(Arrays.toString(res));
    }
}