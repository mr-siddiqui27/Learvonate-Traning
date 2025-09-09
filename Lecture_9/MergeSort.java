package Lecture_9;

public class MergeSort {

    public static void merge(int[] arr, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

    }

    public static void sort(int[] arr, int st, int end){
        if(st<end){
            int mid = st + (end-st)/2;
            sort(arr, st, mid);
            sort(arr,mid+1,end);

        }
    }
}
