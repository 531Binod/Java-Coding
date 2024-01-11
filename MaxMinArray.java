import java.util.Scanner;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size =sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] marks=new int[size];
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            if(marks[i]<min){
                min=marks[i];
            }else if(max<marks[i]){
                max=marks[i];
            }
        }
        System.out.println("Maximum : "+ max);
        System.out.println("Minimum : "+ min);
    }
}
