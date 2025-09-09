package Lecture_9;

import java.util.Arrays;

public class QuickSort {
//  {4,2,6,7,3,1,8}
//    public static int sort(int[] arr, int s, int e){
//        int pivot = arr[s];
//
//    }

//    public static void partition(int[] arr, int s, int e){
//        if(s<e){
//            int pIndex = sort(arr, s, e);
//            partition(arr, s, pIndex-1);
//            partition(arr, pIndex+1,e);
//        }
//    }

    public static void main(String[] args) {
        int[] arr = {3,2,5,7,1,4};
//        partition(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
