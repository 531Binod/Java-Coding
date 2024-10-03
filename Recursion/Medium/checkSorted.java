public class checkSorted {
    public static boolean isSorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(!(isSorted(arr, idx+1))){  // !false==true then if executed
            return false;
        } 
        return arr[idx]<arr[idx+1];
    }
    public static void main(String[] args) {
        int[] arr = {34,56,78,90,200};
        int[] arr1 = {1,4,6,8,9,589,5,890,899};
        if(isSorted(arr1,0)){
            System.out.println("Array is strictly increasing");
        }else{
            System.out.println("not strictly increasing");
        }
    }
}
