package Lecture_8;

public class ReverseArray {
    static void reverse(int[] arr){
        int st=0;
        int end=arr.length-1;
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
