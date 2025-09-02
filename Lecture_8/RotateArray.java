package Lecture_8;

public class RotateArray {

    public static void swap(int[] arr, int l, int r){
        int temp;
        while(l<r){
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k%n;
        swap(arr,0,n-1);
        swap(arr,0,k-1);
        swap(arr,k,n-1);

    }



    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
        
    }
}
